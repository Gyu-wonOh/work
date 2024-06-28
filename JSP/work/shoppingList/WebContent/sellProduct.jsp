<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품선택</h1>
	<div> 홍길동님 환영합니다!!!</div>
	<form action="" method="get">
	<select name="productList" size="1" multiple>
		<option value="1">사과</option>
		<option value="2">배</option>
		<option value="3">수박</option>
	</select>
	<input type="submit" value="추가">
	</form><br>
	<a href="http://localhost:8088/shoppingList/checkOut.jsp">계산</a>
</body>
</html>