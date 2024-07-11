<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
	</script>
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
		#login{
				color:gray;
				background-color:white;
				border:1px solid gray;
				border-radius:5px;
		}
		#productList{
					color:white;				
					background-color:blue;
					border:1px solid blue;
					border-radius:5px;
		}
		#user{
			text-align:right;
		}
	</style>
</head>
<body>
	<%String id= (String)session.getAttribute("id"); %>
	<div id="headPart">
		<table width="90%">
			<tr id="head" >
				<td colspan="2" align="left">Home</td>
					<%if(id!=null){ %>
					<td id="user"><%=id%>님
						<a href= "/shop_test/user/index.User">마이페이지</a>
					</td>
					<td>
					<form action="/shop_test/user/logout.User">
						<input type="submit" value="logout">
					</form>
					</td>
					<td>
						
					</td>
					<%}else{%>
						
					<%}%>
					
				</td>
				<td><img src=""></td>
			</tr>
		</table>
	</div>
	<div id="main">
			<h1>메인화면</h1>
			<h2>shop쇼핑몰입니다.</h2>
			<a href= "/shop_test/shop/products.Shop"><button id="productList">상품목록</button></a>
			<%if(id!=null){%>
				
			<%} else {%>
			<a href= "/shop_test/user/login.User"><button id="login">로그인</button></a>
			<%}%>
	</div>			
</body>
</html>