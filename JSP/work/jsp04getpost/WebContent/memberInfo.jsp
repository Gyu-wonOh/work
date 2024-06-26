<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
 	String name=request.getParameter("name"); 
	String birthday= request.getParameter("birthday");
	String id= request.getParameter("id");
	String pw= request.getParameter("pw");
	%>
	name:<%=name %><br>
	birthday:<%=birthday %><br>
	id:<%=id %><br>
	pw:<%=pw %><br>
</body>
</html>