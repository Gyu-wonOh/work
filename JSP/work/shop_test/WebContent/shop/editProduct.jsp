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
	#head{
		color: white;
		background-color:black;
	}
	#description{
		color: gray;
	}
	#add{
		color:white;
		background-color:blue;
		border:1px solid blue;
		border-radius:5px;
	}
	#list{
		color: white;
		background-color: green;
		border:1px solid green;
		border-radius:5px;
	}
	#button{
		text-align: center;
	}
</style>
</head>
<body>
<table width= "100%">
		<tr id="head">
			<td><a href = "/shop_test/main.Shop">Home</a></td>
			<td><a href = "/shop_test/shop/products.Shop">Product</a></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><a href="/shop_test/user/login.User">로그인</a></td>
			<td><a href="/shop_test/shop/cart.Shop">장바구니 아이콘</a></td>
			<td colspan="2"><input type="text" name="searchBox">&nbsp;<button id="searchButton">search</button></td>
		</tr>
</table>

<h1 align="center">상품 수정</h1>
<h2 align="center" id="description">쇼핑몰 상품목록 입니다.</h2>
<div id="button">
<a href="/shop_test/shop/add.Shop"><button id="add" >상품등록</button></a>
<a href="/shop_test/shop/products.Shop"><button id="list">상품목록</button></a>
</div>

	<c:forEach var="productDto" items="${productDtos}">
		<table>
			<tr>
				<td id="name"colspan="4">${productDto.productName}</td>
			</tr>
			<tr>
				<td colspan="4" align="right">${productDto.productPrice}</td>
			</tr>
			<tr>
				<td colspan="4">${productDto.productDetail}</td>
			</tr>
			<tr>
				<td colspan="2"></td>
				<td>
					<form action="/shop_test/shop/update.Shop" method="get">
					<input type="hidden" name="productCode" value="${productDto.productCode}">
					<input type="submit" value="수정">	
					</form>
				<td>
					<form action="/shop_test/shop/delete_pro.Shop" method="get">
						<input type="hidden" name="productCode" value="${productDto.productCode}">
						<input type="submit" value="삭제">				
					</form>
				</td>
			</tr>
		</table>
		<br>
	</c:forEach>
	<a href= "/shop_test/shop/products.Shop"><button id="productList">상품목록</button></a>
</body>
</html>