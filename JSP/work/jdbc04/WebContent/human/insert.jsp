<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
insert 페이지<br>
	<form action ="/jdbc04/human/insertDB.human" method="get">
	name:<input type="text" name="name"><br>
	age:<input type="text" name="age"><br>
	height:<input type="text" name="height"><br>
	birthday:<input type="datetime-local" name="birthday"><br>
	<input type="submit" value="전송";><br>
	</form>

<a href = "/jdbc04/human/main.jsp">main</a><br>
</body>
</html>