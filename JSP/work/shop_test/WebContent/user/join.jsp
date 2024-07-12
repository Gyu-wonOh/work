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
		#main{
			
		}
		#insertMain{
			margin: auto;
		}
		#join {
			color: white;
			background-color: blue;
			border :1px solid blue;
			border-radius: 5px;
		}
		#cancel {
			color:white;
			background-color:gray;
			border:1px solid gray;
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
		<h1 align="center">회원가입</h1>
			
		<table id="insertMain">
			<tr>
				<td>
					<table>
						<tr><td>아이디</td></tr>
						<tr><td>비밀번호</td></tr>
						<tr><td>비밀번호 확인</td></tr>
						<tr><td>이름</td></tr>
						<tr><td>성별</td></tr>
						<tr><td>생일</td></tr>
						<tr><td>이메일</td></tr>
						<tr><td>전화번호</td></tr>
						<tr><td>주소</td></tr>
						<tr><td><a href="/shop_test/main.User"><button id="cancel">취소</button></a></td></tr>
					</table>
			 	</td>		
				<td> 
					<table>
						<form action="/shop_test/user/join_pro.User" method="get">
						<tr><td><input type="text" name="id"></td></tr>
						<tr><td><input type="password" name="pw"></td></tr>
						<tr><td><input type="text" name="pwcheck"></td></tr>
						<tr><td><input type="text" name="name"></td></tr>
						<tr>
							<td> 
								<input type="radio" name="gender" value="women">여자
						   		<input type="radio" name="gender" value="men">남자
						   	</td>
					   	</tr>
						<tr><td><input type="datetime-local" name="birthday"></td></tr>
						<tr><td><input type="email" name="email"></td></tr>
						<tr><td><input type="text" name="phoneNumber"></td></tr>
						<tr><td><input type="text" name="address"></td></tr>
						<tr>
							<td>
								<input type="submit" id='join' value="가입">
							</td>
						</tr>
						</form>
					</table>
				</td>			
			</tr>
		</table>
	</div>
</body>
</html>
