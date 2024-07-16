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
<h1>
	get 요청방식
</h1>
<p>
	<form action="/ex/myForm/result" method="get">
	id:<input type="text" name="id">
	<input type="submit" value="전송">
	</form>
</p>
<h1>
	post 요청방식
</h1>
<p>
	<form action="/ex/myForm/result" method="post">
	id:<input type="text" name="id">
	<input type="submit" value="전송">
	</form>
</p>
</body>
</html>