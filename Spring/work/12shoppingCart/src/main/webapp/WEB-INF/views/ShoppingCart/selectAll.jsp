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
	<th>UserID</th>
	<th>UserName</th>
	<th>ProductCode</th>
	<th>ProductName</th>
	<th>orderAmount</th>
	</tr>
	<c:forEach items="${list }" var="cartDto">
	<tr>
		<td><a href='/ex/user/read?id=${cartDto.id}'>${cartDto.id }</a></td>
		<td>${cartDto.userId }</td>
		<td>${cartDto.userName}</td>
		<td>
			${cartDto.productCode }
		</td>
		<td>${userDto.productName}</td>
		<td>${userDto.orderAmount}</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/user/insert">장바구니추가</a>
</body>
</html>

