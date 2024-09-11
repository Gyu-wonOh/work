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
		border-radius:5px;
		width: 150px;
		hight:100px;
	}
	#logout{
		background-color:blue;
		color: white;
		border:1px;
		border-radius:5px;
		width: 150px;
		hight:100px;
	}
	#join{
		background-color:green;
		color:white;
		border:1px;
		border-radius:5px;
		width: 150px;
		hight:100px;
		margin:10px;
	}
	#cart{
		background-color:skyblue;
		color:white;
		border:1px;
		border-radius:5px;
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
	<td>
	<%if(id!=null){ %>
		<%=id%>님
	</td>	
	<td>
		<form action="/ex/login/logout">
		<input type="submit" value="logout">
		</form>
	<%}else{%>
			<a href="/ex/login/login">로그인</a>&nbsp;
	<%}%>
	</td>
</tr>
</table>
</div>
<div id='main'>
<h1 id='mainHead' align="center">Home</h1>
<%if(id!=null){%>
	<a href="/ex/login/logout"><button id='logout' width='100px' height='40px'>logout</button></a><br>
	<a href="/ex/product/selectAll"><button id='productList'>상품목록</button></a><br>
<%} else {%>
<a href="/ex/login/login"><button id='login'>log-in</button></a><br>
<a href="/ex/login/join"><button id='join'>join</button></a><br>
<%}%>
</div>
<div id="footer"></div>
</body>
</html>