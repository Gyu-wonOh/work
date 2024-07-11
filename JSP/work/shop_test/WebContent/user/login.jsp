<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		#headPart{
			background-color:black;
		}
		#head{
			color: white;
			
		}
		#link{
			text-align: right;
		}
		#main{
			align: center;
			text-align:center;
			
		}
		#loginForm{
			align:center;
			text-align:center;
			margin:auto;
		}
		#login{
			color:white;
			background-color:blue;
			border:1px solid blue;
			border-radius:5px;
		}
		#join{
			color:white;
			background-color:green;
			border:1px solid green;
			border-radius:5px;
		}
	</style>
	<script>
		if(<%=request.getParameter("isSuccess")%>==false){ 
			alert("id 또는 pw를 잘못 입력하셨습니다.");
		}else if(<%=request.getParameter("isLogin")%>==false){
			alert("로그인 후 사용 가능합니다.");
		}else if(<%=request.getParameter("isLogout")%>==true){
			alert("로그아웃 되었습니다.");
		}
	</script>
</head>
<body>
	<div id="headPart">
		<table width="100%">
			<tr id="head">
				<td><a href="/shop_test/main.User">Home</a></td>
				<td><a href="/shop_test/shop/products.Shop">Product</a></td>
				<td>&nbsp; </td>
				<td>&nbsp; </td>
				<td>&nbsp; </td>
				<td id="link"><a href="/shop_test/user/login.jsp">로그인</a>&nbsp;<a href ="/shop_test/user/join.jsp">회원가입</a>&nbsp;<a href="/shop_test/user/order.jsp">주문내역</a></td>
				<td><img src=""></td>
				<td colspan="2">
				<input type=text value="search">
				<button>search</button>
				</td>
				<td>&nbsp; </td>
			</tr>
		</table>
	</div>
	<div id="main">
		<h1>로그인</h1>
		<table id="loginForm">
			<tr>
				<td colspan="2">
					<form action="/shop_test/user/login_pro.User" method="get">
						<sup>아이디&nbsp;</sup><input type="text" name="id"><br>
						<sup>비밀번호</sup><input type="password" name="pw" value ="0"><br>
						<input type="checkbox">아이디 저장
						<input type="checkbox">자동로그인<br>
				</td>
			</tr>
			<tr>
				<td	colspan="2">
				<input type="submit" id="login" value="로그인">&nbsp;
				</form>
					<a href="/shop_test/user/join.User"><button id="join">회원가입</button></a>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>