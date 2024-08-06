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
	<h1> 회원가입</h1>
	<hr/>
	<form action="/ex/login/insert" method= post>
		ID:<input type="text" name="id" width='12px' height='1px'><br>
		PW:<input type="password" name="pw" width='12px' height='1px'><br>
		이름:<input type="text" name="name" width='12px' height='1px'><br>
		성별:
		남자<input type="radio" name="gender" value="남자" width='12px' height='1px'>
		여자<input type="radio" name="gender" value="여자" width='12px' height='1px'><br>
		생일:<input type="datetime-local" name="birthday" width='12px' height='1px'><br>
		이메일:<input type="text" name="email" width='12px' height='1px'><br>
		전화번호:<input type="text" name="phoneNumber" width='12px' height='1px'><br>
		주소:<input type="text" name="address" width='12px' height='1px'><br>
			<input type="submit" id="login" value="가입" width='12px'height='5px'>
	</form>
</div>

<div id="footer"></div>
</body>
</html>