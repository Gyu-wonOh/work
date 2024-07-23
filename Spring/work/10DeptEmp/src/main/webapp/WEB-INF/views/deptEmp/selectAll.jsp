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
	<c:forEach items="${list }" var="deptEmpDto">
	<tr>
		<td><a href='/ex/deptEmp/read?deptEmpNo=${deptEmpDto.getDeptNo()}'>
		${deptEmpDto.getdName }</a></td>
		<td>${deptEmpDto.getLoc }</td>
		<td>${deptEmpDto.empNo}</td>
		<td>${deptEmpDto.enName}</td>
		<td>${deptEmpDto.job}</td>
		<td>${deptEmpDto.mgr}</td>
		<td>${deptEmpDto.hirDate}</td>
		<td>${deptEmpDto.sal}</td>
		<td>${deptEmpDto.comm}</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/emp/insert">고객추가</a>
</body>
</html>

