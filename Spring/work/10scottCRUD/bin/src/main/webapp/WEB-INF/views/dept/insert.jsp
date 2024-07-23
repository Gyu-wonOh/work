<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
insert
<<<<<<< HEAD:Spring/work/10scottCRUD/src/main/webapp/WEB-INF/views/dept/insert.jsp
<form action="/ex/dept/insert" method="post">
DeptNo : <input type="number" name="deptNo" >
DepartmentName : <input type="text" name="dName" >
Local : <input type="text" name="loc" >
<input type="submit" value="submit">
=======
<form action="/ex/insert" method="post">
이름<input type="text" name=name >
나이<input type="text" name=age >
키<input type="text" name=height >
생일<input type="datetime-local" name=birthday >
<input type="submit" value="제출">
>>>>>>> parent of 50a8fc5 (7/19 스프링 5일):Spring/work/10scottCRUD/src/main/webapp/WEB-INF/views/insert.jsp
</form>
<a href='/ex/dept/selectAll'>back</a>
</body>
</html>
