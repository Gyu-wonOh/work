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
이름에 해당하는 사람의 나이 변경<br>
<form action = "/jdbc03/human/updateDB.human" method="get">
이름:<input type="text" name="name"> <br>
나이:<input type="text" name="age"> <br>
<input type="submit" value="전송">
</form>

<a href="/jdbc03/human/main.human">main</a><br>
</body>
</html>