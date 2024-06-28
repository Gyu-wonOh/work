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
//읽어오기 같은 페이지에서 저장후 찍기때문에 모두 찍힌다.
	out.println((String)pageContext.getAttribute("page1"));
	out.println((String)request.getAttribute("request1"));
	out.println((String)session.getAttribute("session1"));
	out.println((String)application.getAttribute("application1"));
%>
</body>
</html>