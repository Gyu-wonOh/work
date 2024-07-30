<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품 상세 정보</h1>
	<table  id="table" border="1" width="90%" id="customers">
	<tr id="field">
	<th>PRODUCT IMAGE</th>
	<th>PRODUCT CODE</th>
	<th>PRODUCT NAME</th>
	<th>PRODUCT PRICE</th>
	<th>PRODUCT DETAIL</th>
	<th>MANUFACTURE</th>
	<th>CATEGORY</th>
	<th>STOCKAMOUNT</th>
	<th>STATUS</th>
	</tr>
	<tr>
		<td><img src='${productDto.productImagePath}' width="100px" height="100px"></td>
		<td>${productDto.productCode}</td>
		<td>${productDto.productName}</td>
		<td>${productDto.productPrice}</td>
		<td>${productDto.productDetail}</td>
		<td>${productDto.manufacture}</td>
		<td>${productDto.category}</td>
		<td>${productDto.stockAmount}</td>
		<td>${productDto.status}</td>
	</tr>
</table>
</body>
</html>