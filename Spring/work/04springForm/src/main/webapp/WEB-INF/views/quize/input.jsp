<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	요청주소 /ex.quize/input<br>
	사용자 입력<br>

<form action="/ex/quize/result" method="get">
id:<input type="text" name="id"><br>
pw:<input type="text" name="pw"><br>
name:<input type="text" name="name"><br>
age:<input type="text" name="age"><br>
<input type="submit" value="전송">
</form>
</body>
</html>