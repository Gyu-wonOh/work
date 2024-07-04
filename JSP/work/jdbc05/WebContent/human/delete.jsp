<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
delete 페이지<br>
<form action="/jdbc05/human/deleteDB.human" method="get">
name:<input type="text" name="name">
<input type="submit" value="delete">
</form>

<a href=/jdbc05/human/main.human>main</a>
</body>
</html>