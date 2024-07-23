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
<form action="/ex/dept/update" method="post">
Department Number<input type="text" name=deptNo value="${deptDto.deptNo }" readonly>
Department Name<input type="text" name=age value="${deptDto.dName }">
Local<input type="text" name=loc value="${deptDto.loc }">
<input type="submit" value="수정">
</form>
</body>
</html>
