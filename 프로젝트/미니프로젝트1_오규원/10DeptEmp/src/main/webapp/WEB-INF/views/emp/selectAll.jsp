<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
var result='${msg}';
if(result=='success'){
	alert('처리가 완료되었습니다.');
}
</script>
</head>
<body>
<h1>고객 정보</h1>
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
	<c:forEach items="${list }" var="empDto">
	<tr>
		<td><a href='/ex/emp/read?empNo=${empDto.empNo}'>
		${empDto.empNo }</a></td>
		<td>${empDto.enName }</td>
		<td>${empDto.job}</td>
		<td>${empDto.mgr}</td>
		<td>${empDto.hirDate}</td>
		<td>${empDto.sal}</td>
		<td>${empDto.comm}</td>
		<td>${empDto.deptNo}</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/emp/insert">고객추가</a>
</body>
</html>

