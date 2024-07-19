<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
insert
<form action="/ex/insert" method="post">
DeptNo : <input type="number" name="deptNo" >
DepartmentName : <input type="text" name="dName" >
Local : <input type="text" name="loc" >
<input type="submit" value="제출">
</form>
</body>
</html>
