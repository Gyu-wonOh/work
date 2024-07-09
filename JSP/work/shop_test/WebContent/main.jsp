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
	 	#head{	
	 			color:white;
	 			background-color:black;
		}
		#login{
				color:gray;
				background-color:white;
		}
		#productList{
					color:white;				
					background-color:blue;
		}
	</style>
</head>
<body>
	<table width="90%">
		<tr id="head" >
			<td align="left">Home</td>
			<td></td>
			<td><img src=""></td>
		</tr>
		<tr id="main">
			<td colspan="3">
				<h1 align="center">메인화면</h1>
				<h2 align="center">shop쇼핑몰입니다.</h2>
			</td>

		</tr>
		<tr>
			<td></td>
			<td>
				<a href= "/shop_test/shop/products.Shop"><button id="productList">상품목록</button></a>
				<a href= "/shop_test/user/login.User"><button id="login">로그인</button></a>
			</td>
			<td></td>
		</tr>
	</table>

</body>
</html>