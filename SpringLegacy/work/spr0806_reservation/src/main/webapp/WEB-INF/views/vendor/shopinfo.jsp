<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<%@include file="../include/header.jsp"%>
<div class="header-placeholder"></div>
<main><br><br>
    샵 정보 등록/수정   아직 등록만 테스트, 중복등록주의
    <form:form method="post" action="${pageContext.request.contextPath}/vendor/shopinfo" modelAttribute="businessPlaceInfo">
        <div>
            <label for="email">이메일:</label>
            <form:input path="email" id="email" value="${sessionScope.loginEmail}" readonly="true"/>
        </div>
        <div>
            <label for="business_regi_num">사업자 등록 번호:</label>
            <form:input path="business_regi_num" id="business_regi_num" value="${sessionScope.loginBusiness_regi_num}" readonly="true"/>
        </div>
        <div>
            <label for="place_info">자기 사업장 설명 소개 :</label>
            <form:input path="place_info" id="place_info"/>
        </div>
        <div>
            <label for="img_path0">이미지 경로 0:</label>
            <form:input path="img_path0" id="img_path0"/>
        </div>
        <div>
            <label for="img_path1">이미지 경로 1:</label>
            <form:input path="img_path1" id="img_path1"/>
        </div>
        <div>
            <label for="img_path2">이미지 경로 2:</label>
            <form:input path="img_path0" id="img_path2"/>
        </div>
        <div>
            <input type="submit" value="등록"/>
        </div>
    </form:form>
    

${sessionScope.loginName}<br>
${sessionScope.loginEmail}<br>
${sessionScope.loginAuthority}<br>
</main>

<%@include file="../include/footer.jsp"%>