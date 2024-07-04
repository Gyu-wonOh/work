<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
select 페이지<br>

	<table border="1" width="90%" id="customer">
	<tr>
	<th>name</th><th>age</th><th>height</th><th>birthday</th>
	</tr>
	<c:forEach var="humanDto" items="${humanDtos}">
		<tr>
		<td>${humanDto.name}</td>
		<td>${humanDto.age}</td>
		<td>${humanDto.height}</td>
		<td>${humanDto.birthday}</td>
		</tr>
	</c:forEach>	
	</table>
	
	<a href=/jdbc05/human/main.human>main</a>
</body>
</html>