<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#head{
		color:white;
		background-color:black;
		}
</style>
</head>
<body>
	<table width="100%">
		<tr id="head">
			<td><a href="/shop_test/main.User">Home</a></td>
			<td><a href="/shop_test/shop/products.Shop">Product</a></td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td><a href="/shop_test/user/login.jsp">로그인</a>&nbsp;<a href ="/shop_test/user/join.jsp">회원가입</a>&nbsp;<a href="/shop_test/user/order.jsp">주문내역</a></td>
			<td><img src=""></td>
			<td colspan="2">
			<textarea>search</textarea>
			<button>search</button>
			</td>
			<td>&nbsp; </td>
		</tr>
	</table>
	<h1 align="center">주문내역</h1>
	<h2 align="center">비회원 주문하신 경우, 전화번호와 주문 비밀번호를 입력해주세요.</h2>
	
	<form action= "/shop_test/user/order_pro.User" method="get">
	전화번호:<input type="text" id="phoneNumber"><br>
	주문비밀번호:<input type="password" id="oderPw">
	<input type="submit" id="selectProduct" value="조회">
	</form>
	
</body>
</html>