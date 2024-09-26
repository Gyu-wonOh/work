<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="true"%>
<%@include file="../include/header.jsp"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<div class="header-placeholder"></div>

<main> name : ${vendorInfo.name } <br>
<%--
phone : ${vendorInfo.phone } <br>
business_name : ${vendorInfo.business_name } <br>
vendorInfo.zipcode : ${vendorInfo.zipcode } <br>
vendorInfo.basic_address : ${vendorInfo.basic_address } <br>
vendorInfo.detail_address : ${vendorInfo.detail_address } <br>
vendorInfo.business_type : ${vendorInfo.business_type } <br>
 --%>
장소 정보<br>
<img src="${pageContext.request.contextPath}/${mainImg}" alt="메인 이미지"
	style="max-width: 200px; max-height: 200px;" /> <c:if
	test="${not empty placeInfo}">
	<table border="1">
		<tr>
			<th>Email</th>
			<td id="placeEmail">${placeInfo.email}</td>
		</tr>
		<tr>
			<th>Business Registration Number</th>
			<td id="placeRegiNum">${placeInfo.business_regi_num}</td>
		</tr>
		<tr>
			<th>Place Info</th>
			<td>${placeInfo.place_info}</td>
		</tr>
		<!-- 이미지 리스트가 비어있지 않은 경우 -->
		<c:if test="${not empty placeImagePathDtos}">
			<c:forEach var="dto" items="${placeImagePathDtos}" varStatus="status">
				<tr>
					<th>Image ${status.index + 1}</th>
					<td><img
						src="${pageContext.request.contextPath}/${dto.place_img_path}"
						alt="Image ${status.index + 1}"
						style="max-width: 200px; max-height: 200px;" /></td>
				</tr>
			</c:forEach>
			<!-- 이미지 리스트가 비어있는 경우 -->
		</c:if>
		<c:if test="${empty placeImagePathDtos}">
			<tr>
				<td colspan="2">이미지가 없습니다</td>
			</tr>
		</c:if>
	</table>
</c:if> <!--  안씀 
        <a href="<c:url value='/member/scheduleselect?email=${placeInfo.email}&business_regi_num=${placeInfo.business_regi_num}'/>">예약하기</a>
         -->

<div class="serviceItem-container">
	<c:forEach var="serviceItem" items="${serviceItems }"
		varStatus="status">
		<div class="serviceItem-card"
			data-serviceItemId="${serviceItem.item_id }"
			data-serviceName="${serviceItem.service_name }"
			data-serviceDescription="${serviceItem.service_description }"
			data-requiredTime="${serviceItem.required_time }"
			data-servicePrice="${serviceItem.service_price }">
			<p>이름 : ${serviceItem.service_name }</p>
			<p>설명 : ${serviceItem.service_description }</p>
			<p>시간 : 약 ${serviceItem.required_time * 30}분</p>
			<p>가격 : ${serviceItem.service_price }원</p>
			<input type="checkbox" class="item_idChkBox" id="item_idChkBox"
				name="item_idChkBox" value="${serviceItem.item_id }" />
			<!-- <a href="productDetail.pdt?pdt_no=${productDto.pdt_no}">상세 보기</a>  -->
		</div>
	</c:forEach>
</div>
<input type="button" id="nextBtn" value="다음단계" /> <!-- 값 가져갈거 가격,시간,벤더이메일,사업자번호,선택된아이템id들 -->
<br>
<%--
data = { //SelectedItemsDto 다음페이지로 넘어가면서 세션에 저장 <br>
email: email, 벤더이메일 <br>
business_regi_num: businessRegiNum, 벤더사업자번호<br>
totalRequiredTime: totRequiredTimes, 선택된시간총합<br>
totalServicePrice: totServicePrices, 선택된가격총합<br>
selectedItems: selectedItemIdsAry //cardObjDto 선택한메뉴각각의정보객체배열<br>
};<br>

${sessionScope.loginName}<br>
${sessionScope.loginEmail}<br>
${sessionScope.loginAuthority}<br>
 --%>
</main>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=c665e334713bdbedf11d514849fcb54b&libraries=services,clusterer,drawing"></script>
<script>
	const vendorInfo = {
		address : '${vendorInfo.basic_address}', // 업체의 기본 주소
		businessName : '${vendorInfo.business_name}', // 업체명
		mainImg : '${pageContext.request.contextPath}' + '${mainImg}' // 이미지 경로
	};
	console.log('Vendor Info:', vendorInfo); // 객체가 제대로 정의되었는지 확인 -->
</script>
<div id="map" style="width: 100%; height: 500px;"></div>
<script src="../resources/js/mapUtils.js"></script>
<script src="../resources/js/vendorMap.js"></script>
<script src="../resources/js/mbusinessplaceinfo.js"></script>
<!-- 댓글입력창 -->
<h2>Reply</h2>
<div>
	<div>
		작성자: <input type="text" id="newReviewWriter" />
	</div>
	<br>
	<div>
		내용: <input type="text" id="newReviewText" />
	</div>
	<br>
	<button id="reviewAddBtn">댓글등록</button>
	<br>
</div>

<ul id="reviews"></ul>
<div class="pagination"></div>
<!-- Mod 버튼 댓글이 달려있지 않으면 display:none 상태이다. -->
<div id='modDiv' style="display: none">
	<div class="modal-title"></div>
	<div>
		내용: <input type="text" id='modContent'>
	</div>
	<div>
		<button type="button" id="reviewModBtn">수정</button>
		<button type="button" id="reviewDelBtn">삭제</button>
		<button type="button" id="closeBtn">창닫기</button>
	</div>
</div>
<div id='reviewReplyMod' style="display: none">
	<div class="re-modal-title"></div>
	<div>
		작성자: <input type='text' id='reviewReplyName'>
	</div>
	<div>
		내용: <input type='text' id='reviewReplyText'>
	</div>
	<div>
		<button type='button' id='reviewReplyAddBtn'>등록</button>
		<button type='button' id='reviewReplyCloseBtn'>창 닫기</button>
	</div>
</div>

<script>
	var business_regi_num = "${BusinessPlaceInfoDto.business_regi_num}";
	var page = 1;
	$(document).ready(function(){
		var formObj=$(".form");
		console.log(formObj);
		getPageList(page);
		
	function getPageList(page) {
		$.ajax({
			type : 'GET',
			url : '/ex/reviews/' + business_regi_num + '/' + page,
			dataType : 'json',
			success : function(data) {
			console.log(data);
			var str = "";
			$(data.list).each(function() {
				var indent = this.reviewIndent * 30;
				str += "<div data-reviewId='"+this.reviewId+"' class='reviewLi' style='margin-left:"+indent+"px'>"
				+ this.reviewId + ":"
				+ this.reviewName
				+ "<br>"
				+ this.reviewContent
				+ "<br><button>수정/삭제</button></div>"
				+ "<div data-reviewId='"+this.reviewId+"' class='reviewReplyLi' style='margin-left:"+indent+"px'>"
				+ "<button>리뷰</button></div>"
			});
			$("#reviews").html(str);
				var pagination = "";
				if (data.pageMaker.prev) {
					pagination += "<a href='"
							+ (data.pageMaker.startPage - 1)
							+ "'> &laquo; </a>";
				}
				for (var i = data.pageMaker.startPage; i <= data.pageMaker.endPage; i++) {
					var strClass = data.pageMaker.page == i ? 'class="active"'
							: '';
					pagination += "<a" + strClass + " href='" + i + "'>"
							+ i + "</a>";
				}
				if (data.pageMaker.next) {
					pagination += "<a href='"
							+ (data.pageMaker.endPage + 1)
							+ "'>&raquo; </a>";
				}
				console.log(str)
				$(".pagination").html(pagination);
				},
				error : function(xhr, status, error) {
					console.error("Error: ", error);
				}
		});
		}
		/* 댓글 mod 수정/삭제 버튼 .on(click 이벤트시 reviewLi button만 실행시켜라) */
		$("#reviews").on("click",".reviewLi button",function() {
			var reviewId = $(this).parent().attr(
					"data-reviewId");
			var reviewContent = $(this).parent()
					.text();
			$(".modal-title").html(reviewId);
			$("#modContent").val(reviewContent);
			$("#modDiv").show("slow");
		});
		/* 댓글 창닫기 버튼 */
		$("#closeBtn").on("click", function() {
			$("#modDiv").hide("slow");
		});
		/* 댓글 수정 버튼 */
		$("#reviewModBtn").on("click", function() {
			var reviewId = $(".modal-title").html();
			var reviewContent = $("#modContent").val();

			$.ajax({
				type : 'PUT',
				url : '/ex/reviews/' + reviewId,
				headers : {
					"Content-Type" : "application/json"
				},
				data : JSON.stringify({
					reviewContent : reviewContent
				}),
				dataType : 'text',
				success : function(result) {
					if (result == 'SUCCESS') {
						alert("수정되었습니다.");
						$("#modDiv").hide("slow");
						getPageList(page);
					}
				}
			});
		});
		$("#reviews").on("click",".reviewReplyLi button",function() {
			var reviewId = $(this).parent().attr("data-reviewId");
			$(".re-modal-title").html(reviewId);
			$("#reviewReplyMod").show("slow");
		})

		$("#reviewReplyCloseBtn").on("click", function() {
			$("#reviewReplyMod").hide("slow");
		})

		/* 대댓글 등록버튼 */
		$("#reviewReplyAddBtn").on("click", function() {
			var reviewId = $(".re-modal-title").html();
			var reviewName = $("#reviewReplyName").val();
			var reviewContent = $("#reviewReplyText").val();

			$.ajax({
				type : 'POST',
				url : '/ex/reviews/' + reviewId,
				headers : {
					"Content-Type" : "application/json"
				},
				dataType : 'text',
				data : JSON.stringify({
					business_regi_num : business_regi_num,
					reviewContent : reviewContent,
					reviewName : reviewName,
					reviewId : reviewId,
				}),
				success : function(result) {
					if (result == 'SUCCESS') {
						alert("댓글이 등록됐습니다.");
						$("#reviewReplyMod").hide("slow");
						getPageList(page);
					}
				},
				error : function(xhr, status, error) {
					console.error("Error: ", error);
				}
			});
		});
		/* 리뷰 등록 버튼 */
		$("#reviewAddBtn").on("click", function() {
			var reviewName = $("#newReviewWriter").val();
			var reviewContent = $("#newReviewText").val();

			$.ajax({
				type : 'POST',
				url : '/ex/reviews', //ReviewRestController
				headers : {
					"Content-Type" : "application/json"
				},
				dataType : "text",
				data : JSON.stringify({
					business_regi_num : business_regi_num,
					reviewContent : reviewContent,
					reviewName : reviewName
				}),
				success : function(result) {
					if (result == 'SUCCESS') {
						alert("댓글이 등록됐습니다.");
						getPageList(page);
					}
				},
				error : function(xhr, status, error) {
					console.error("Error: ", error);
				}
			});
		});

		/* 리뷰삭제 버튼 */
		$("#reviewDelBtn").on("click", function() {
			var reviewId = $(".modal-title").html();
			$.ajax({
				type : 'delete',
				url : '/ex/reviews/' + reviewId,
				headers : {
					"Content-Type" : "application/json"
				},
				dataType : 'text',
				success : function(result) {
					if (result == 'SUCCESS') {
						alert("삭제 되었습니다.");
						$("#modDiv").hide("slow");
						getPageList(page);
					}
				}
			});
		});
		
	$(".pagination").on("click", "a", function(event) {
		event.preventDefault();
		page = $(this).attr("href");
		getPageList(page);
	});
	$(".btn-review").on("click", function(){
		formObj.attr("action", "/ex/businessplaceinfo/reviews");
		formObj.attr("method", "get");		
		formObj.submit();
	});
	
	})
</script>

<%@include file="../include/footer.jsp"%>