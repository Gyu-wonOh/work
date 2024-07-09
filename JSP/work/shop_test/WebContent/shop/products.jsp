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
<h1>상품목록</h1>
<h2>쇼핑몰 상품목록 입니다.</h2>
<a href="/shop_test/shop/add.Shop"><button id="add">상품등록</button></a>
<a href="/shop_test/shop/editProduct.Shop"><button id="edit">상품편집</button></a>
<a href="/shop_test/shop/cart.Shop"><button id="cart">장바구니담기</button></a>
<a href="/shop_test/shop/product.Shop"><button id="detail">상세정보</button></a>

</body>
</html>