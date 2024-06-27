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
	String updateValue= request.getParameter("updateValue");
	Cookie cookie = new Cookie(name,updateValue);
	cookie.setMaxAge(600);
	response.addCookie(cookie);
	
	out.println("변경된 name:"+cookie.getName()+"<br>");
	out.println("변경된 value:"+cookie.getValue()+"<br>");
	out.println("MaxAge:"+cookie.getMaxAge()+"<br>");
%>
</body>
</html>