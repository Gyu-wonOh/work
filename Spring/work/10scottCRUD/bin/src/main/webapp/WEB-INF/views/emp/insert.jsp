<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
insert
<form action="/ex/emp/insert" method="post">
Employee No : <input type="number" name="empNo" >
English Name : <input type="text" name="enName" >
Job : <input type="text" name="job" >
Manager : <input type="text" name="mgr" >
Hire Date : <input type="datetime-local" name="hireDate" >
Salary : <input type="text" name="sal" >
Commission : <input type="text" name="comm" >
<input type="submit" value="submit">
</form>
<a href='/ex/emp/selectAll'>back</a>
</body>
</html>
