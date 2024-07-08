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
<script>
	if(<%=request.getParameter("isSuccess")%>==false){ 
		alert("id 또는 pw를 잘못 입력하셨습니다.");
	}else if(<%=request.getParameter("isLogin")%>==false){
		alert("로그인 후 사용 가능합니다.");
	}

</script>
</head>
<body>
	<table width="100%">
		<tr id="head">
			<td>Home</td>
			<td>Product</td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td><a href="/shop_test/user/login.jsp">로그인</a>&nbsp;<a href ="/shop_test/user/join.jsp">회원가입</a>&nbsp;<a href="/shop_test/user/order.jsp">주문내역</a></td>
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
				<form action="/shop_test/user/login_pro.User" method="get">
					<sup>아이디&nbsp;</sup><input type="text" name="id"><br>
					<sup>비밀번호</sup><input type="password" name="pw" value ="0"><br>
					<input type="checkbox">아이디 저장
					<input type="checkbox">자동로그인<br>
					<input type="submit" id="id" value="로그인"><br>
					
				</form>
				<a href="/shop_test/user/join.User"><button id="join">회원가입</button></a>
			</td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>			
		</tr>
	</table>
</body>
</html>