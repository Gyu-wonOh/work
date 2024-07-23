<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}
#customers tr:nth-child(even){background-color: #f2f2f2;}
#customers tr:hover {background-color: #ddd;}
#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
  select
  <table id='customers' width=100% border="1">
	<tr>
	    <th style="width: 10px">선택</th>
		<th style="width: 10px">Employee No</th>
		<th style="width: 100px">English Name</th>
		<th style="width: 200px">JOB</th>
		<th style="width: 40px">Manager</th>
		<th style="width: 40px">Hire Date</th>
		<th style="width: 40px">Salary</th>
		<th style="width: 40px">Commission</th>
	</tr>
		<tr>
		    <td><a href="/ex/emp/delete?empNo=${dto.empNo}">delete</a></td>
			<td>${dto.empNo }</td>
			<td >${dto.enName}</td>
			<td >${dto.job }</td>
			<td >${dto.mgr }</td>
			<td >${dto.hirDate }</td>
			<td >${dto.sal }</td>
			<td >${dto.comm }</td>
		</tr>
	</table>
	<a href='/ex/emp/update?empNo=${dto.empNo }&enName=${dto.enName }&job=${dto.job }&mgr=${dto.mgr }&hirDate=${dto.hirDate }&sal=${dto.sal }&comm=${dto.comm }'>update</a><br>
	<a href='/ex/emp/selectAll'>back</a>
</body>
</html>
