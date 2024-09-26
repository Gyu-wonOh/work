<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table boarder="1" width="90%" id="customers">
	<tr>
	<th>deptNo</th>
	<th>dName</th>
	<th>loc</th>
	</tr>
	<tr>
		<td>${deptDto.deptNo }</td>
		<td>${deptDto.dName }</td>
		<td>${deptDto.loc}</td>
	</tr>
	
</table>
<a href='/ex/dept/selectAll'>목록가기</a>
<a href='/ex/dept/delete?deptNo=${deptDto.deptNo }'>삭제</a>
<a href='/ex/dept/modify?deptNo=${deptDto.deptNo }'>수정</a>
</body>
</html>









