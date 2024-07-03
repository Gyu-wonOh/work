<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
update 페이지<br>

<form action="/jdbc04/human/updateDB.human" method="get">
수정할 age:<input type="text" name ="age">
name : <input type="text" name="name">
<input type="submit" value="수정">
</form>
<a href = "/jdbc04/human/main.jsp">main</a><br>
</body>
</html>