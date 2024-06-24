<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!String str1="MyString1<br>";//전역변수 선언 
	public String strFunction(){//함수 선언
		return "<br>functionString<br>";
	}
%>
<%
	String str2= "MyString2<br>";//지역변수 선언
%>
<% 
	out.println(str1);
	out.println(str2);
/*
	나눠서 여러개로 기술할 수 있다. ; 사용하지 않음
*/
%>
<%= str1 %>
<%= str2 %>
<%= "직접출력<br>" %>
<%= 50 %>
<%= 50+20 %>
<%=strFunction() %>
</body>
</html>