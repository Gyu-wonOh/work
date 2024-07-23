<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
update
<form action="/ex/emp/update" method="post">
Employee Number<input type="text" name=empNo value="${empDto.empNo }" readonly>
English Name<input type="text" name=enName value="${empDto.enName }">
JOB<input type="text" name=job value="${empDto.job }">
Manager<input type="text" name=mgr value="${empDto.mgr }">
Hire Date<input type="datetime-local" name=hirdate value="${empDto.hirDate }">
Salary<input type="text" name=sal value="${empDto.sal }">
Commission<input type="text" name=comm value="${empDto.comm }">
<input type="submit" value="수정">
</form>
</body>
</html>
