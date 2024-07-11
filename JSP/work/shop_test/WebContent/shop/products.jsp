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
		border:1px solid blue;
		border-radius: 5px
	}
	#edit{
		color:white;
		background-color:green;
		border:1px solid green;
		border-radius: 5px
	}
	#cart{
		background-color:yellow;
		border:1px solid yellow;
		border-radius: 5px;
	}
	#button{
		align:center;
		text-align:center;
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
	
	<h1 align = "center">상품목록</h1>
	<h2 align = "center">쇼핑몰 상품목록 입니다.</h2>
	<br>
	<div id="button">
	<a href="/shop_test/shop/add.Shop"><button id="add">상품등록</button></a>
	<a href="/shop_test/shop/editProduct.Shop"><button id="edit">상품편집</button></a>
	<a href="/shop_test/shop/cart.Shop"><button id="cart">장바구니담기</button></a>
	</div>
	<br>
	<br>
	<br>
	
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
						<form action="/shop_test/shop/product.Shop" method="get">
						<input type="hidden" name="productCode" value="${productDto.productCode}">
						<input type="hidden" name="productName" value="${productDto.productName}">
						<input type="hidden" name="productManufacture" value="${productDto.manufacture}">
						<input type="hidden" name="category" value="${productDto.category}">
						<input type="hidden" name="status" value="${productDto.status}">
						<input type="hidden" name="stockAmount" value="${productDto.stockAmount}">
						<input type="hidden" name="productPrice" value="${productDto.productPrice}">
						<input type="submit" value="상세정보">	
						</form>
					</td>
				</tr>
			</table>
			<br>
		</c:forEach>
		
</body>
</html>