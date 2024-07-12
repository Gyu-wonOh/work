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
		background-color: black;
	}
	#head {
		color: white;
	}
	#main{
		align:center;
		text-align:center;
	}
	#update{
		color: white;
		background-color:skyblue;
		border:1px solid skyblue;
		border-radius:5px;
		
	}
	#delete {
		color: white;
		background-color: red;
		border:1px solid red;
		border-radius: 5px;
	}
</style>
</head>
<body>
	<%String id= (String)session.getAttribute("id"); %>
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
		<table>
			<tr>
				<td><a href="/shop_test/user/index.User">마이페이지</a></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><a href="/shop_test/user/update.User">회원정보 수정</a></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><a href="/shop_test/user/order.User">주문내역</a></td>
				<td></td>
				<td></td>
				<td></td>
				<td colspan="3" rowspan="2"><h1>회원 정보 수정</h1></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>아이디</td>
				<td></td>
				<td rowspan="8">
					<form action="/shop_test/user/update_pro.User" method="get">
						<input type="text" name="id"><br> 
						<input type="text"name="name"><br> 
						<input type="radio" name="gender" value="women">여자
				   		<input type="radio" name="gender" value="men">남자<br>
						<input type="datetime-local" name="birthday"><br> 
						<input type="email" name="email" value="{email}"> <br> 
						<input type="text" name="phoneNumber" value="${phoneNumber}"><br>
						<input type="text" name="address" value="${address}"><br>
						<input type="submit" name="value" id="delete" value="회원 탈퇴">
						<input type="submit" name="value" id="update" value="수정">
					</form>
				</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>이름</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>성별</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>생일</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>이메일</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>전화번호</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>주소</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td>copyrightShop</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
	</div>
		
</body>
</html>