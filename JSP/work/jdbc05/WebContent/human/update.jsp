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
<form action="/jdbc05/human/updateDB.human" method="get">
수정할 age:<input type="text" name="age"><br>
name: <input type="text" name="name"><br>
<input type="submit" value="update">
</form>

<a href=/jdbc05/human/main.human>main</a>
</body>
</html>