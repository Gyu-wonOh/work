<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<%@include file="../include/header.jsp"%>

<div class="header-placeholder"></div>
<main>
    <h2>예약 정보 입력</h2>
    
    <form:form action="/reservation/submit" method="post" modelAttribute="reservationForm">
        <!-- 예약(주문)번호 -->
        <div>
            <label for="reservationNumber">예약 번호:</label>
            <form:input path="reservation_number" id="reservationNumber" type="text" />
        </div>
        
        <!-- 유저 이메일 -->
        <div>
            <label for="userEmail">유저 이메일:</label>
            <form:input path="user_email" id="userEmail" type="email" />
        </div>
        
        <!-- 유저 이름 -->
        <div>
            <label for="userName">유저 이름:</label>
            <form:input path="user_name" id="userName" type="text" />
        </div>
        
        <!-- 유저 전화번호 -->
        <div>
            <label for="userPhone">유저 전화번호:</label>
            <form:input path="user_phone" id="userPhone" type="text" />
        </div>
        
        <!-- 사업자 이메일 -->
        <div>
            <label for="vendorEmail">사업자 이메일:</label>
            <form:input path="vendor_email" id="vendorEmail" type="email" value="${sessionScope.selectedItemsDto.email}"/>
        </div>
        
        <!-- 사업자 번호 -->
        <div>
            <label for="businessRegiNum">사업자 번호:</label>
            <form:input path="business_regi_num" id="businessRegiNum" type="text" value="${sessionScope.selectedItemsDto.business_regi_num}"/>
        </div>
        
        <!-- 사업자 이름 -->
        <div>
            <label for="vendorName">사업자 이름:</label>
            <form:input path="vendor_name" id="vendorName" type="text" />
        </div>
        
        <!-- 사업자 전화번호 -->
        <div>
            <label for="vendorPhone">사업자 전화번호:</label>
            <form:input path="vendor_phone" id="vendorPhone" type="text" />
        </div>
        
        <!-- 우편번호 -->
        <div>
            <label for="zipcode">우편번호:</label>
            <form:input path="zipcode" id="zipcode" type="text" />
        </div>
        
        <!-- 기본 주소 -->
        <div>
            <label for="basicAddress">기본 주소:</label>
            <form:input path="basic_address" id="basicAddress" type="text" />
        </div>
        
        <!-- 상세 주소 -->
        <div>
            <label for="detailAddress">상세 주소:</label>
            <form:input path="detail_address" id="detailAddress" type="text" />
        </div>
        
        <!-- 예약 발생 날짜 -->
        <div>
            <label for="reservationDate">예약 발생 날짜:</label>
            <form:input path="reservation_date" id="reservationDate" type="date" />
        </div>
        
        <!-- 이용 예정 날짜 -->
        <div>
            <label for="reservationUseDate">이용 예정 날짜:</label>
            <form:input path="reservation_use_date" id="reservationUseDate" type="date" />
        </div>
        
        <!-- 이용 예정 시간 -->
        <div>
            <label for="times">이용 예정 시간:</label>
            <form:input path="times" id="times" type="text" />
        </div>
        
        <!-- 서비스 이름들 -->
        <div>
            <label for="totalServiceName">이용 예정 서비스 이름들:</label>
            <form:input path="total_service_name" id="totalServiceName" type="text" />
        </div>
        
        <!-- 서비스 가격 총 합 -->
        <div>
            <label for="totalServicePrice">서비스 가격 총 합:</label>
            <form:input path="total_service_price" id="totalServicePrice" type="number" />
        </div>
        
        <!-- 제공(필요)시간 총 합 -->
        <div>
            <label for="totalRequiredTime">필요 시간 총 합:</label>
            <form:input path="total_required_time" id="totalRequiredTime" type="number" />
        </div>
        
        <!-- 유저 요청사항 메모 -->
        <div>
            <label for="userRequestMemo">유저 요청사항 메모:</label>
            <form:textarea path="user_request_memo" id="userRequestMemo" rows="5" cols="50"></form:textarea>
        </div>
        
        <!-- 주문 상태 
        <div>
            <label for="status">주문 상태:</label>
            <form:select path="status" id="status">
                <option value="1">입금대기</option>
                <option value="2">입금완료</option>
                <option value="3">이용완료</option>
                <option value="4">이용자취소</option>
                <option value="5">사업자취소</option>
                <option value="6">환불대기</option>
                <option value="7">환불완료</option>
            </form:select>
        </div>
-->

        <!-- 제출 버튼 -->
        <div>
            <button type="submit">예약 등록</button>
        </div>
    </form:form>
    

${sessionScope.loginName}<br>
${sessionScope.loginEmail}<br>
${sessionScope.loginAuthority}<br>
</main>
<%@include file="../include/footer.jsp"%>