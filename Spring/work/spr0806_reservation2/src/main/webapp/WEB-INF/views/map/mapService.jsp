<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>카카오맵 서비스</title>
<link rel="stylesheet" href="/ex/resources/css/mapServiceStyle.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript"
    src="//dapi.kakao.com/v2/maps/sdk.js?appkey=c441b3b3b2ef1a8131497b58ac1bae64&libraries=services,clusterer,drawing"></script>
<script>
    $(document).ready(function() {
        var mapContainer = document.getElementById('map');
        var mapOption = {
            center: new kakao.maps.LatLng(37.4911, 126.7221),
            level: 3
        };
        var map = new kakao.maps.Map(mapContainer, mapOption);
        var geocoder = new kakao.maps.services.Geocoder();
        var markers = [];

        function clearMarkers() {
            markers.forEach(function(marker) {
                marker.setMap(null);
            });
            markers = [];
        }

        function addMarkerFromAddress(address, name, imageUrl) {
            geocoder.addressSearch(address, function(result, status) {
                if (status === kakao.maps.services.Status.OK) {
                    var coords = new kakao.maps.LatLng(result[0].y, result[0].x);

                    var marker = new kakao.maps.Marker({
                        position: coords,
                        map: map
                    });
                    markers.push(marker);

                    var safeName = encodeHTML(name);
                    var safeImageUrl = encodeHTML(imageUrl);

                    var infowindow = new kakao.maps.InfoWindow({
                        content: '<div style="padding:5px; font-size:12px;">'
                            + '<div style="margin-bottom:5px;">'
                            + '<strong>' + encodeHTML(name) + '</strong>'
                            + '</div>'
                            + '<hr style="border:1px solid #ddd; margin:5px 0;">'
                            + '<div>'
                            + '<img src="' + encodeHTML(imageUrl) + '" style="width:100px; height:auto; display:block;">'
                            + '</div>'
                            + '</div>',
                        removable: true
                    });

                    kakao.maps.event.addListener(marker, 'mouseover', function() {
                        infowindow.open(map, marker);
                    });

                    kakao.maps.event.addListener(marker, 'mouseout', function() {
                        infowindow.close();
                    });

                    map.setCenter(coords);
                } else {
                    console.error('주소 변환 실패:', address);
                }
            });
        }

        function encodeHTML(str) {
            return (str || '').replace(/&/g, "&amp;").replace(/</g, "&lt;")
                .replace(/>/g, "&gt;").replace(/"/g, "&quot;")
                .replace(/'/g, "&#039;");
        }

        $("#searchButton").click(function() {
            var query = $('#searchInput').val();

            $.ajax({
                url: '/ex/searchMarkers',
                method: 'GET',
                data: { query: query },
                dataType: 'json',
                success: function(data) {
                    if (Array.isArray(data)) {
                        clearMarkers();
                        $('.search-results').empty();
                        data.forEach(function(markerData) {
                            addMarkerFromAddress(markerData.basic_address, markerData.business_name, markerData.place_image_url);

                            $('.search-results').append(
                                '<li class="search-result-item">'
                                + '<strong>' + encodeHTML(markerData.business_name) + '</strong><br>'
                                + encodeHTML(markerData.basic_address) + '<br>'
                                + '<img src="' + markerData.place_image_url + '" alt="' + encodeHTML(markerData.business_name) + '" style="width:100px; height:auto; margin-top:5px;">'
                                + '<button class="find-button" data-address="' + encodeHTML(markerData.basic_address) + '" data-name="' + encodeHTML(markerData.business_name) + '" data-image-url="' + encodeHTML(markerData.place_image_url) + '">위치보기</button>'
                                + '</li>'
                            );
                        });
                        $('.find-button').show();
                    } else {
                        console.error('Unexpected data format:', data);
                    }
                },
                error: function(xhr, status, error) {
                    console.error('Error fetching markers:', status, error);
                }
            });
        });

        $(document).on('click', '.find-button', function() {
            var address = $(this).data('address');
            var name = $(this).data('name');
            var imageUrl = $(this).data('image-url');

            geocoder.addressSearch(address, function(result, status) {
                if (status === kakao.maps.services.Status.OK) {
                    var coords = new kakao.maps.LatLng(result[0].y, result[0].x);

                    map.setCenter(coords);

                    var marker = new kakao.maps.Marker({
                        position: coords,
                        map: map
                    });
                    markers.push(marker);

                    var infowindow = new kakao.maps.InfoWindow({
                        content: '<div style="padding:5px; font-size:12px;">'
                            + '<div style="margin-bottom:5px;">'
                            + '<strong>' + encodeHTML(name) + '</strong>'
                            + '</div>'
                            + '<hr style="border:1px solid #ddd; margin:5px 0;">'
                            + '<div>'
                            + '<img src="' + encodeHTML(imageUrl) + '" style="width:100px; height:auto; display:block;">'
                            + '</div>'
                            + '</div>',
                        removable: true
                    });

                    infowindow.open(map, marker);
                } else {
                    console.error('주소 변환 실패:', address);
                }
            });
        });

        kakao.maps.event.addListener(map, 'rightclick', function(mouseEvent) {
            var latlng = mouseEvent.latLng;

            var marker = new kakao.maps.Marker({
                position: latlng,
                map: map
            });

            markers.push(marker);

            kakao.maps.event.addListener(marker, 'click', function() {
                marker.setMap(null);
                markers = markers.filter(function(m) {
                    return m !== marker;
                });
            });
        });
    });
</script>
</head>
<body>
    <div class="app">
        <header class="header">
            <h1>어디로든 놀러가</h1>
        </header>
        <div class="container">
            <div class="search-section">
                <div class="search-form">
                    <input type="text" name="query" placeholder="업체를 검색하세요" class="search-input" id="searchInput" />
                    <button type="button" class="search-button" id="searchButton">검색</button>
                </div>
                <ul class="search-results">
                    <!-- 검색 결과가 여기에 추가됩니다 -->
                    <c:forEach var="result" items="${results}">
                        <li class="search-result-item">
                            <strong>${result.business_name}</strong><br>
                            ${result.basic_address}<br>
                            <!-- 버튼은 검색 후 결과가 있을 때만 표시됩니다 -->
                            <img src="${result.place_image_url}" alt="${result.business_name}" style="width:100px; height:auto; margin-top:5px;">
                            <!-- 위치보기 버튼 추가 -->
                            <button class="find-button" data-address="${result.basic_address}" data-name="${result.business_name}" data-image-url="${result.place_image_url}">위치보기</button>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <div id="map" class="map"></div>
        </div>
    </div>
</body>
</html>

