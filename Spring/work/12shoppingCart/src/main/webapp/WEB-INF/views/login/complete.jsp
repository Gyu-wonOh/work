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
	#home{
		background-color:blue;
		color: white;
		border:1px;
		border-radius:5px;
		width: 150px;
		hight:100px;
	}
	#member{
		background-color:lightgreen;
		color: white;
		border:1px;
		border-radius:5px;
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
	<h1> 회원가입 완료</h1>
	<hr/>
	<h2>회원 가입이 완료되었습니다.</h2><br>
	<a href="/ex/main"><button id='home' width='30px' height='10px'>메인으로 이동</button></a><br>
	<a href="/ex/login/member"><button id='member' width='30px' height='10px'>회원페이지 이동</button></a>
</div>

<div id="footer"></div>
</body>
</html>