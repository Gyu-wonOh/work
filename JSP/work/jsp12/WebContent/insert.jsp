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
	String name = request.getParameter("name");
	String value = request.getParameter("value");
	
	Cookie cookie= new Cookie(name,value);
	cookie.setMaxAge(600);
	response.addCookie(cookie);
	
	out.println("name:"+cookie.getName()+"<br>");
	out.println("value:"+cookie.getValue()+"<br>");
	out.println("age:"+cookie.getMaxAge()+"<br>");
	%>
</body>
</html>