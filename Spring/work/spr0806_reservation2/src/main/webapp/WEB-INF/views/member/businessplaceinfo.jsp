<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<%@include file="../include/header.jsp"%>
<div class="header-placeholder"></div>
<main>
name : ${vendorInfo.name } <br>
phone : ${vendorInfo.phone } <br>
business_name : ${vendorInfo.business_name } <br>
vendorInfo.zipcode : ${vendorInfo.zipcode } <br>
vendorInfo.basic_address : ${vendorInfo.basic_address } <br>
vendorInfo.detail_address : ${vendorInfo.detail_address } <br>
vendorInfo.business_type : ${vendorInfo.business_type } <br>


    장소 정보<br>

    <c:if test="${not empty placeInfo}">
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
            <tr>
                <th>Image Path 0</th>
                <td>${placeInfo.img_path0}</td>
            </tr>
            <tr>
                <th>Image Path 1</th>
                <td>${placeInfo.img_path1}</td>
            </tr>
            <tr>
                <th>Image Path 2</th>
                <td>${placeInfo.img_path2}</td>
            </tr>
        </table>
        <!--  안씀 
        <a href="<c:url value='/member/scheduleselect?email=${placeInfo.email}&business_regi_num=${placeInfo.business_regi_num}'/>">예약하기</a>
         -->
    </c:if>
    <div class="serviceItem-container">
	    <c:forEach var="serviceItem" items="${serviceItems }" varStatus="status">
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
	        <input type="checkbox" class="item_idChkBox" id="item_idChkBox" name="item_idChkBox" value="${serviceItem.item_id }"/>
	        <!-- <a href="productDetail.pdt?pdt_no=${productDto.pdt_no}">상세 보기</a>  -->
	    </div>
	    </c:forEach>
	</div>
	<input type="button" id="nextBtn" value="다음단계" />
	<!-- 값 가져갈거 가격,시간,벤더이메일,사업자번호,선택된아이템id들 -->
	<br>data = {	//SelectedItemsDto 다음페이지로 넘어가면서 세션에 저장  <br>
                    email: email, 벤더이메일 <br>
                    business_regi_num: businessRegiNum, 벤더사업자번호<br>
                    totalRequiredTime: totRequiredTimes, 선택된시간총합<br>
                    totalServicePrice: totServicePrices, 선택된가격총합<br>
                    selectedItems: selectedItemIdsAry	//cardObjDto 선택한메뉴각각의정보객체배열<br>
                };<br>
	
${sessionScope.loginName}<br>
${sessionScope.loginEmail}<br>
${sessionScope.loginAuthority}<br>
</main>
<script src="../resources/js/mbusinessplaceinfo.js"></script>
<%@include file="../include/footer.jsp"%>