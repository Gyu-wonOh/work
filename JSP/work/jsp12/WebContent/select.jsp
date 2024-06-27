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
	Cookie[] cookies= request.getCookies();
	for(Cookie cookie:cookies){
		out.println("=======================<br>");
		out.println("name:"+cookie.getName()+"<br>");
		out.println("value:"+cookie.getValue()+"<br>");
		out.println("name:"+cookie.getMaxAge()+"<br>");	
	}
	
	%>
</body>
</html>