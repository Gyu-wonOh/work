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
			color:white;
			}
		#main{
			text-align:center;
		}
	</style>
</head>
<body>
	<%String id= (String)session.getAttribute("id"); %>
	<div id= "headPart">
		<table width="100%">
			<tr id="head">
				<td><a href="/shop_test/main.User">Home</a></td>
				<td><a href="/shop_test/shop/products.Shop">Product</a></td>
				<td>&nbsp; </td>
				<td>&nbsp; </td>
				<td>&nbsp; </td>
				<td>
					<%if(id!=null){ %>
						<%=id%>님
						<a href="/shop_test/user/index.jsp">마이페이지</a>
						</td>
						<td>
						<form action="/shop_test/user/logout.User">
							<input type="submit" value="logout">
						</form>
					<%}else{%>
						<a href="/shop_test/user/login.User">로그인</a>&nbsp;
						&nbsp;<a href ="/shop_test/user/join.jsp">회원가입</a>&nbsp;
					<%}%>
				</td>
				<td>
				<a href="/shop_test/user/order.jsp">주문내역</a>
				</td>
				<td><img src=""></td>
				<td colspan="2">
				<input type="text" value="search">
				<button>search</button>
				</td>
			</tr>
		</table>
	</div>
	<div id="main">
		<h1 align="center">주문내역</h1>
		<%if(id!=null){ %>
				<!-- 
				1.회원 정보와 일치하는 주문DB select
				2.forEach로 화면에 출력 
				-->
		<%}else{%>
			<h2 align="center">비회원 주문하신 경우, 전화번호와 주문 비밀번호를 입력해주세요.</h2>
			<form action= "/shop_test/user/order_pro.User" method="get">
			전화번호:<input type="text" id="phoneNumber"><br>
			주문비밀번호:<input type="password" id="oderPw">
			<input type="submit" id="selectProduct" value="조회">
			</form>
		<%}%>
	</div>
</body>
</html>