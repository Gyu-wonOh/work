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
	<th>empNo</th>
	<th>enName</th>
	<th>job</th>
	<th>Mgr</th>
	<th>Hire Date</th>
	<th>Salary</th>
	<th>Commission</th>
	<th>Dept No</th>
	</tr>
	<tr>
		<td>${empDto.empNo }</td>
		<td>${empDto.enName }</td>
		<td>${empDto.job}</td>
		<td>${empDto.mgr}</td>
		<td>${empDto.hirDate}</td>
		<td>${empDto.sal}</td>
		<td>${empDto.comm}</td>
		<td>${empDto.deptNo}</td>
	</tr>
	
</table>
<a href='/ex/emp/selectAll'>목록가기</a>
<a href='/ex/emp/delete?empNo=${empDto.empNo }'>삭제</a>
<a href='/ex/emp/modify?empNo=${empDto.empNo }'>수정</a>
</body>
</html>









