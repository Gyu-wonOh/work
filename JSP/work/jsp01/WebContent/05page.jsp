<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import = "java.time.LocalDateTime" %>
	<%@ page import = "java.time.format.*" %>	
	<%@ page import = "java.util.Arrays" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String formatDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	String formatDate2 = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd"));
	%>
	<%=formatDate %><br>
	<%=formatDate2 %>
	<% int[] iArr={10,20,30};
	%>
	<%=Arrays.toString(iArr) %>
</body>
</html>