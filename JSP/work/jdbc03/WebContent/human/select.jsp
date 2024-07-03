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
<table border= "1" width="90%" id= "customers">
	<tr>
		<th>name</th><th>age</th><th>height</th><th>birthday</th><th>birthday</th>
	</tr>
	
	<!--데이터 반복 -->
	<c:forEach var="humanDto" items="${humanDtos}">
		<fmt:parseDate value="${humanDto.birthday}"
       pattern="yyyy-MM-dd'T'HH:mm"
       var="bDate" type="both" ></fmt:parseDate>
		<tr>
			<td>${humanDto.name}</td>
			<td>${humanDto.age}</td>
			<td>${humanDto.height}</td> 
			<td>${humanDto.birthday}</td>
			<td><fmt:formatDate value="${bDate}" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"/></td>
		</tr>
	</c:forEach>
</table>

<a href="/jdbc03/human/main.human">main</a><br>
</body>
</html>