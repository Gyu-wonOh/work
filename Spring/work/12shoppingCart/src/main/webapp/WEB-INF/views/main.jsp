<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#main{
		text-align: center;
	}
	#head{ 
		background-color:lightgreen;
	}
	#login{
		background-color:blue;
		color: white;
		border:1px;
		radius:5px;
		width: 150px;
		hight:100px;
	}
	#join{
		background-color:green;
		color:white;
		border:1px;
		radius:5px;
		width: 150px;
		hight:100px;
		margin:10px;
	}
</style>
</head>
<body>
<%String id= (String)session.getAttribute("id"); %>
<div id='head'>
<table>
<tr>
	<td><a href="/ex/main">home</a></td>
</tr>
</table>
</div>
<div id='main'>
<h1 id='mainHead' align="center">Home</h1>
<%if(id!=null){%>
<%} else {%>
<a href="/ex/login/login"><button id='login'>log-in</button></a><br>
<a href="/ex/login/join"><button id='join'>join</button></a><br>
<%}%>
</div>
<div id="footer"></div>
</body>
</html>