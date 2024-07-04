<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#head{
		color: white;
		background-color:black;
	}
	#id{
		color:white;
		background-color:blue;
	}
	#join{
		cololr:white;
		background-color:green;
	}
</style>
</head>
<body>
	<table width="100%">
		<tr id="head">
			<td>Home</td>
			<td>Product</td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>로그인&nbsp;회원가입&nbsp;주문내역</td>
			<td><img src=""></td>
			<td colspan="2">
			<textarea>search</textarea>
			<button>search</button>
			</td>
			<td>&nbsp; </td>
		</tr>
		<tr>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>
			<h1 align="center">로그인</h1>
			</td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
		</tr>
		<tr>
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>
				<form action="/shop_test/user/login_pro.jsp" method="get">
					<sup>아이디&nbsp;</sup><input type="text" name="id"><br>
					<sup>비밀번호</sup><input type="text" name="pw"><br>
					<input type="checkbox">아이디 저장
					<input type="checkbox">자동로그인<br>
					<input type="submit" id="id" value="로그인"><br>
					
				</form>
				<a href="/shop_test/user/join.jsp"><button id="join">회원가입</button></a>
			</td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>			
		</tr>
	</table>
</body>
</html>