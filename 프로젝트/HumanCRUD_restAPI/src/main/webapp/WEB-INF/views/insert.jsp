<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="head">
		<h1 id="title">selectName</h1>
	</div>
	<div id="row">
		<form action="/ex/insert" method="post">
		이름:<input type="text" name="name" value="이름을 입력하세요">
		나이:<input type="text" name="age" value="나이를 입력하세요">
		키: <input type="text" name="height" value="키를 입력하세요">
		생일:<input type="datetime-local" name="birthday">
		<input type="submit" value="등록">
		</form>
	</div>
</body>
</html>