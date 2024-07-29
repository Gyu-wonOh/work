<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#title{
		background-color:black;
		color:white;
	}
	#info{
		background-color:rgb(200,200,200);
		text-align:center;
		
	}
</style>
<script>
var result='${msg}';
if(result=='success'){
	alert('처리가 완료되었습니다.');
}
</script>
</head>
<body>
<h1>인사정보 관리</h1>
<table border="0" width="90%" id="customers">
	<tr id="title">
	<th>DEPT NO</th>
	<th>DEPT NAME</th>
	<th>LOC</th>
	<th>EMP No.</th>
	<th>Name</th>
	<th>JOB</th>
	<th>MGR</th>
	<th>HIRE DATE</th>
	<th>SALARY</th>
	<th>COMMISSION</th>
	</tr>
	<c:forEach items="${list }" var="deptEmpDto">
	<tr id="info">
		<td>${deptEmpDto.deptNo }</td>
		<td>${deptEmpDto.dName }</td>
		<td>${deptEmpDto.loc }<br>
		<a href='/ex/deptEmp/updateDept?deptNo=${deptEmpDto.deptNo}'>수정</a>
		<a href='/ex/deptEmp/deleteDept?deptNo=${deptEmpDto.deptNo}'>삭제</a></td>
		<td>${deptEmpDto.empNo}</td>
		<td>${deptEmpDto.enName}</td>
		<td>${deptEmpDto.job}</td>
		<td>${deptEmpDto.mgr}</td>
		<td>${deptEmpDto.hirDate}</td>
		<td>${deptEmpDto.sal}</td>
		<td>${deptEmpDto.comm}<br>
		<a href='/ex/deptEmp/updateEmp?empNo=${deptEmpDto.empNo}'>수정</a>
		<a href='/ex/deptEmp/deleteEmp?empNo=${deptEmpDto.empNo}'>삭제</a></td>
		</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/deptEmp/insert">사원추가</a>
</body>
</html>

