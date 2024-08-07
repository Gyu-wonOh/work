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
				<form action="/login/logout">
				<input type="submit" value="logout">
				</form>
				<%}else{%>
				<a href="/login/login">로그인</a>&nbsp;
				<%}%>
			</td>
		</tr>
	</table>
</div>
<div id="main">
	<h1> 회원페이지</h1>
	<hr/>
	<h2>회원전용 페이지입니다.</h2><br>
	<a href="/ex/user/update"><button id='home' width='30px' height='10px'>회원정보 수정</button></a><br>
	<a href="/ex/Cart/selectId"><button id='cart' width='30px' height='10px'>장바구니</button></a>
</div>

<div id="footer"></div>
</body>
</html>