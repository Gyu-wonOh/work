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
	Cookie cookie = new Cookie(name,"");
	cookie.setMaxAge(0);
	response.addCookie(cookie);
	
	out.println("삭제된 name:"+cookie.getName()+"<br>");
	out.println("삭제된 value:"+cookie.getValue()+"<br>");
	%>
</body>
</html>