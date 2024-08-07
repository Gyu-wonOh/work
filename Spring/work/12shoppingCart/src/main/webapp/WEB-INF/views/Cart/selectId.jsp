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
<%String id= (String)session.getAttribute("id"); %>
<div id='head'>
	<table>
		<tr>
			<td><a href="/ex/main">home</a></td>
			<td>
				<%if(id!=null){ %>
					<%=id%>님
			</td>	
			<td>
				<form action="/login/logout">
				<input type="submit" value="logout">
				</form>
				<%}else{%>
				<a href="/login/login">로그인</a>&nbsp;
				<%}%>
			</td>
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
		<td>${cartDto.cartId }</td>
		<td>${cartDto.userId }</td>
		<td>${cartDto.productCode }</td>
		<td>${cartDto.orderAmount}</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/main">메인페이지</a>

</div>
</body>
</html>

