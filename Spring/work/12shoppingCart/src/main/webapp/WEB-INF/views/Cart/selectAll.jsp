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
<div id='head'>
	<table>
		<tr>
			<td>Home</td><td></td><td>로그인</td>
		</tr>
	</table>
</div>
<div id= 'main'>
<hr/>
<h1>장바구니</h1>
<table  id="table" boarder="1" width="90%" id="customers">
	<tr id="field">
	<th>CartID</th>
	<th>UserID</th>
	<th>UserName</th>
	<th>ProductCode</th>
	<th>ProductName</th>
	<th>orderAmount</th>
	</tr>
	<c:forEach items="${list }" var="cartDto">
	<tr>
		<td>
			<a href='/ex/Cart/read?id=${cartDto.userId}'>
			${cartDto.userId }</a>
		</td>
		<td>${cartDto.userName}</td>
		<td>${cartDto.productCode }</td>
		<td>${cartDto.productName}</td>
		<td>${cartDto.orderAmount}</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/user/insert">장바구니추가</a>

</div>
</body>
</html>

