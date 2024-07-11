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
	#description{
		color:gray;
	}
	#input{
		margin:auto;
	}
	#list{
		text-align: left;
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
				<td><a href="/shop_test/shop/cart.Shop">장바구니 아이콘</a></td>
				<td colspan="2"><input type="text" name="searchBox">&nbsp;<button id="searchButton">search</button></td>
			</tr>
		</table>
	</div>
		<h1 align="center">상품등록</h1>
		<h3 align="center">Shop 쇼핑몰입니다.</h3>
		<div id="main">
			<td colspan="6" rowspan="13">
				<table id="input">
					<form action="/shop_test/shop/add_pro.Shop" method="get">
					<tr>
						<td>상품이미지</td><td colspan="5"><input type="file"></td>
					</tr>
					<tr>
						<td>상품코드</td><td colspan="5"><input type="text" name= "productCode"></td>
					</tr>
					<tr>
						<td>상품명</td><td colspan="5"><input type="text" name= "productName"></td>
					</tr>
					<tr>
						<td>가격</td><td colspan="5"><input type="text" name= "productPrice"></td>
					</tr>
					<tr>
						<td>상세정보</td><td colspan="5"></td>
					</tr>
					<tr>
						<td colspan="6"><textarea name="productDetail" width="100%">상세정보를 입력하세요.</textarea></td>
					</tr>
					<tr>	
						<td>제조사</td><td colspan="5"><input type="text" name="manufacture"></td>
					</tr>
					<tr>
						<td>분류</td><td colspan="5"><input type="text" name="category"></td>
					</tr>
					<tr>
						<td>재고 수</td><td colspan="5"><input type="text" name="stockAmount"></td>
					</tr>
					<tr>
						<td>상태</td><td colspan="5"><input type="radio" name="status" value="new">신규제품<input type="radio" name="status" value="secondHand">중고제품<input type="radio" name="status" value="return">재생제품</td>
					</tr>
					<tr>
						<td></td><td></td><td></td><td></td><td></td><td align="right"><input type="submit" name="submit" value="등록"></td>
					</tr>
					</form>
				</div>
				<div>
					<table width="100%">
						<tr>
						<td></td>
						<td id="list">
							<a href= "/shop_test/shop/products.Shop"><button id="productList">상품목록</button></a>
						</td>
						<td></td>
						</tr>
					</table>				
					
				</div>
</body>
</html>