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
<form action="/board/confirmId" method="get">
id:<input type="text" name="id"><br>
pw:<input type="text" name="pw"><br>
name:<input type="text" name="name"><br>
age:<input type="text" name="age"><br>
<input type="submit" value="전송">
</form>
사용자가 전송한 값 출력 <br>
id=${id}<br>
pw=${pw}<br>
name=${name}<br>
age=${age}
</body>
</html>