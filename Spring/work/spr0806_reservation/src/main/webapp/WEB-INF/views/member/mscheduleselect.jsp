<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<style>
.acontainer {
	width: 400px;
	margin: 0 auto;
}

#time-buttons {
	display: grid;
	grid-template-columns: repeat(6, 1fr);
	gap: 5px;
	margin-top: 20px;
}

.time-slot {
	padding: 10px;
	text-align: center;
	border: 1px solid #ccc;
	cursor: pointer;
}


/* 예약 가능한 버튼 스타일 */
.time-slot.available {
    background-color: #FFFFFF;	/* 흰색  */
    color: #3C1E1E;
}

.time-slot.selected {
	background-color: #FFEB33;	/* 노란색  */
	color: #3C1E1E;
}

/* 예약 불가능 버튼 스타일 */
.time-slot.unavailable {
    background-color: #CCCCCC; 	/* 회색  */
    color: #a0a0a0;
    cursor: not-allowed;
}
</style>


<%@include file="../include/header.jsp"%>
<div class="header-placeholder"></div>
<div class="content">
<br><br>

loginEmail: [${sessionScope.loginEmail}] , <br>
loginBusiness_regi_num: [${sessionScope.loginBusiness_regi_num}] ,<br>
loginName: [${sessionScope.loginName}]<br>
loginPhone: [${sessionScope.loginPhone}] , <br>

<br>
vendorEmail: [${sessionScope.selectedItemsDto.email}] , <br>
vendorBusiness_regi_num: [${sessionScope.selectedItemsDto.business_regi_num}] ,<br>
totalRequiredTime: [${sessionScope.selectedItemsDto.totalRequiredTime}] , <br>
totalServicePrice: [${sessionScope.selectedItemsDto.totalServicePrice}] , <br>
selectedItems: [${sessionScope.selectedItemsDto.selectedItems}] ,<br>
selectedItemsDto: [${sessionScope.selectedItemsDto}] ,<br>
<br>
<br><br>
selectedItemsDto
<input type="text" id="selectedItemsDto" value="${sessionScope.selectedItemsDto}"><br>
selectedItemsDto.email
<input type="text" id="selectedItemsDto" value="${sessionScope.selectedItemsDto.email}"><br>
selectedItemsDto.business_regi_num
<input type="text" id="selectedItemsDto" value="${sessionScope.selectedItemsDto.business_regi_num}"><br>
selectedItemsDto.totalRequiredTime
<input type="text" id="selectedItemsDto" value="${sessionScope.selectedItemsDto.totalRequiredTime}"><br>
selectedItemsDto.totalServicePrice
<input type="text" id="selectedItemsDto" value="${sessionScope.selectedItemsDto.totalServicePrice}"><br>
<!-- 다음 주문확인 페이지에서 정보들 정리해서 결제 한셈 치고 userreservation테이블로 넘기면 주문완료까지는 진행 -->
<br><br>
<div class="acontainer">
    <!-- <h1>영업일 및 영업시간 선택</h1> -->schedule select
    <br><br>
    <input type="text" id="vendorEmail" value="${sessionScope.selectedItemsDto.email}">
    <input type="text" id="vendorBusiness_regi_num" value="${sessionScope.selectedItemsDto.business_regi_num}">
    <input type="text" id="selectedDate" value="${selectedDate}" readonly>
    <input type="text" id="datepicker" placeholder="날짜를 선택하세요">
    <input type="text" id="selectedTime" readonly>
    <div id="time-buttons"></div>
    <button type="button" id="getSubmitBtn">get</button>
    <button type="button" id="postSubmitBtn">post</button>
    <button type="button" id="reservationSubmitBtn">예약하기</button>
</div>

</div>
</body>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="../resources/js/mscheduleselect.js"></script>
<%@include file="../include/footer.jsp"%>
