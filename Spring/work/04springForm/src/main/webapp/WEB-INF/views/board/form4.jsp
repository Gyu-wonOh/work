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
<h1>Hello world! ok... 안녕</h1>
humanDto
<p>${humanDto.id}</p>
<p>${humanDto.pw}</p>
<p>${humanDto.name}</p>
<p>${humanDto.age}</p>

newHuman
<p>${newHuman.id}</p>
<p>${newHuman.pw}</p>
<p>${newHuman.name}</p>
<p>${newHuman.age}</p>
</body>
</html>