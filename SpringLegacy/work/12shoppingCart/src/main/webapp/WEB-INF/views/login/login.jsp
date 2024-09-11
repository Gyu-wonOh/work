<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
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
	
</style>
</head>
<body>
<div id='head'>
	<table>
		<tr>
			<td><a href="/ex/main">home</a></td>
		</tr>
	</table>
</div>
<div id="main">
	<h1> 로그인</h1>
	<hr/>
	<form action="/ex/login/login" method= post>
		ID:<input type="text" name="id" width='12px' height='1px'><br>
		PW:<input type="password" name="pw" width='12px' height='1px'><br>
			<input type="submit" id="login" value="login" width='12px'height='5px'>
	</form>
</div>

<div id="footer"></div>
</body>
</html>