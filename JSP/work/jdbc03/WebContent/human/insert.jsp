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
회원 입력<br>
<form action = "/jdbc03/human/insertDB.human" method="get">
이름:<input type="text" name="name"> <br>
나이:<input type="text" name="age"> <br>
키:<input type="text" name="height"> <br>
생일:<input type="datetime-local" name="birthday"> <br>
<input type="submit" value="전송">
</form>

<a href="/jdbc03/human/main.human">메인</a><br>
</body>
</html>