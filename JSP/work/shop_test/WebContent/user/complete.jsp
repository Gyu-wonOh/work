<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
			width: auto;
		}
		#main{
			text-align: center;
		}
		#update{
			color: gray;
			background-color:white;
			border:1px solid blue;
			border-radius:5px;
		}
		#orderList{
			color: gray;
			background-color:white;
			border:1px solid blue;
			border-radius:5px;
		}
		#search{
			text-align:right;
		}
	</style>
</head>
<body>
	<%
	String index = request.getParameter("index");
	String id = (String)session.getAttribute("id");
	%>
	
		<div id="headPart">
		<table width= "100%">
			<tr id="head">
				<td><a href = "/shop_test/main.Shop">Home</a></td>
				<td><a href = "/shop_test/shop/products.Shop">Product</a></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td>
					<%if(id!=null){ %>
							<td>
							<%=id%>님
							<a href="/shop_test/user/index.jsp">마이페이지</a>
							</td>
							<td>
							<form action="/shop_test/user/logout.User">
								<input type="submit" value="logout">
							</form>
						<%}else{%>
							<td>
							<a href="/shop_test/user/login.User">로그인</a>&nbsp;
							&nbsp;<a href ="/shop_test/user/join.jsp">회원가입</a>&nbsp;
							</td>
						<%}%>
				</td>
				<td><a href="/shop_test/shop/cart.Shop">장바구니 아이콘</a></td>
				<td colspan="2"><input type="text" name="searchBox">&nbsp;<button id="searchButton">search</button></td>
			</tr>
		</table>
	</div>
	<div id="main">
		<h1>회원 정보</h1>
	
		<%if("0".equals(index)){//회원가입
			out.println("회원가입이 완료되었습니다.");
		}else if("1".equals(index)){//로그인 성공
			out.println(id+" 님 환영합니다.");
		%><br>
			<form action= "/shop_test/user/update.User" method="get">
				<input type="hidden" value='${id}'>
				<input type="submit" id="update" value="회원정보 수정">
			</form>
			<a href = "/shop_test/user/order.User"><button id="orderList">주문내역</button></a><br>
		<%
		}else if("2".equals(index)){//회원 정보수정
			out.println("회원정보 수정이 완료되었습니다.");
		}%>
	</div>		
</body>
</html>