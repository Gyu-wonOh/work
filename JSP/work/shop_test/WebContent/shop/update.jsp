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
<h2 align="center" id="description">shop쇼핑몰 입니다.</h2>
<br>
<br>
<br>

<table>
	<tr>
		<td>
			<table>
				<tr>
					<td>상품코드</td>
				</tr>
				<tr>
					<td>가격</td>
				</tr>
				<tr>
					<td>재고 수</td>
				</tr>
				<tr>
					<td><a href = "/shop_test/shop/products.Shop"><button id="list">목록</button></a></td>
				</tr>
			</table>
		</td>
		<td>
			<table>
				<form action = "/shop_test/shop/update_pro.Shop" method="get">
				<tr>
					<td name="productCode"><c:out value="${productCode}"/></td>
				</tr>
				<tr>
					<td><input type="text" name="productPrice"></td>
				</tr>
				<tr>
					<td><input type="text" name="stockAmount"></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="수정">
					</td>
				</tr>
				</form>
			</table>
			<a href= "/shop_test/shop/editProduct.Shop"><button id="productList">편집목록</button></a>
		</td>
	</tr>
</table>
</body>
</html>