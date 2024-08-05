<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#table{
		text-align: center;
	}
	#field{
		background-color: skyblue;
		color:white;
	}
</style>
<script>
var result='${msg}';
if(result=='success'){
	alert('처리가 완료되었습니다.');
}
</script>
</head>
<body>
<h1>상품 정보</h1>
<table  id="table" border="0" width="90%" id="customers">
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
	<c:forEach items="${list }" var="productDto">
	<tr>
		<td><img src='${productDto.productImagePath }' width="100px" height="100px"></td>
		<td><a href='/ex/product/select?productCode=${productDto.productCode}'>${productDto.productCode }</a></td>
		<td>${productDto.productName }</td>
		<td>${productDto.productPrice}</td>
		<td>${productDto.productDetail }</td>
		<td>${productDto.manufacture}</td>
		<td>${productDto.category}</td>
		<td>${productDto.stockAmount}</td>
		<td>${productDto.status}</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/product/insert">상품추가</a>
</body>
</html>

