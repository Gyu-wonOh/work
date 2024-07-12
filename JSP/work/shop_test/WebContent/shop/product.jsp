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
		background-color:black;
	}
	#add{
		color:white;
		background-color:blue;
	}
	#edit{
		color:white;
		background-color:green;
	}
	#cart{
		background-color:yellow;
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
	<h1 align="center">상품 상세정보</h1>
	<h2 align="center">상품 상세정보 페이지 입니다.</h2>
	<div align="center" style="text-align:left;">
	상품코드: ${productDto.productCode}<br>
	상품이름: ${productDto.productName}<br>
	제조사명: ${productDto.manufacture}<br>
	분     류: ${productDto.category}<br>
	상     태: ${productDto.status}<br>
	재고수량: ${productDto.stockAmount}<br>
	상품가격: ${productDto.productPrice}<br>
	<a href= "/shop_test/shop/products.Shop"><button id="productList">상품목록</button></a>
	</div>
</body>
</html>