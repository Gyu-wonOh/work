<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	delete 페이지
	<br>
	<form action="/jdbc04/human/deleteDB.human" method="get">
	삭제할 Data name:<input type="text" name="name">
	<input type="submit" value="삭제">
	</form>
	<a href="/jdbc04/human/main.jsp">main</a>
	<br>
</body>
</html>