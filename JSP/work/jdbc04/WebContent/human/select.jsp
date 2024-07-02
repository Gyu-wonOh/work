<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	select 페이지
	<br>

	<table border="1" width="90%" id="costumers">
		<tr>
			<th>name</th>
			<th>age</th>
			<th>height</th>
			<th>birthday</th>
		</tr>
		<c:for-each var="humanDto" items=${humanDtos}>
		
			<td>${name}</td>
			<td>${age}</td>
			<td>${height}</td>
			<td>${birthday}</td>
	
		</c:for-each>
	</table>
	<a href="/jdbc04/human/main.jsp">main</a>
	<br>

</body>
</html>