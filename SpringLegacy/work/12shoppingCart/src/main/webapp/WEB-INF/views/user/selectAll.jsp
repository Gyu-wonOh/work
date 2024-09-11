<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#table{
		text-align: center;
	}
	#field{
		background-color: skyblue;
		color:white;
	}
</style>
<script>
var result='${msg}';
if(result=='success'){
	alert('처리가 완료되었습니다.');
}
</script>
</head>
<body>
<h1>고객 정보</h1>
<table  id="table" boarder="1" width="90%" id="customers">
	<tr id="field">
	<th>ID</th>
	<th>NAME</th>
	<th>GENDER</th>
	<th>BIRTHDAY</th>
	<th>E-MAIL</th>
	<th>PHONE NUMBER</th>
	<th>ADDRESS</th>
	</tr>
	<c:forEach items="${list }" var="userDto">
	<tr>
		<td><a href='/ex/user/read?id=${userDto.id}'>${userDto.id }</a></td>
		<td>${userDto.name }</td>
		<td>${userDto.gender}</td>
		<td>
			<fmt:parseDate value="${userDto.birthday }" pattern="yyyy-MM-dd'T'HH:mm" var="now" type="both" />
			<fmt:formatDate pattern="yyyy-MM-dd" value= "${now}"/>
		</td>
		<td>${userDto.email}</td>
		<td>${userDto.phoneNumber}</td>
		<td>${userDto.address}</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/user/insert">고객추가</a>
</body>
</html>

