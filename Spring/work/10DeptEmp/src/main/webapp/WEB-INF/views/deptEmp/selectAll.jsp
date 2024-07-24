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
<h1>사원 정보</h1>
<table boarder="1" width="90%" id="customers">
	<tr>
	<th>deptNo</th>
	<th>dName</th>
	<th>loc</th>
	<th>empNo</th>
	<th>enName</th>
	<th>job</th>
	<th>Mgr</th>
	<th>Hire Date</th>
	<th>Salary</th>
	<th>Commission</th>
	</tr>
	<c:forEach items="${list }" var="deptEmpDto">
	<tr>
		<td><a href='/ex/deptEmp/read?deptEmpNo=${deptEmpDto.deptNo}'>
		${deptEmpDto.deptNo }</a></td>
		<td>${deptEmpDto.dName }</td>
		<td>${deptEmpDto.loc }</a>
		<a href='/ex/deptEmp/deleteDept?deptNo=${deptEmpDto.deptNo}'>삭제</a></td>
		<td>${deptEmpDto.empNo}</td>
		<td>${deptEmpDto.enName}</td>
		<td>${deptEmpDto.job}</td>
		<td>${deptEmpDto.mgr}</td>
		<td>${deptEmpDto.hirDate}</td>
		<td>${deptEmpDto.sal}</td>
		<td>${deptEmpDto.comm}
		<a href='/ex/deptEmp/deleteEmp?=${depEmpDto.empNo}'>삭제</a></td>
		</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/deptEmp/insert">사원추가</a>
</body>
</html>

