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
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4; /* 연한 회색 */
    }
    #head {
        background-color: #f7e7d4; /* 연한 베이지색 */
        padding: 15px;
        border-bottom: 2px solid #e0d6c0; /* 살짝 어두운 베이지색 */
    }
    #head table {
        width: 100%;
    }
    #head td {
        padding: 10px;
    }
    #head a {
        text-decoration: none;
        color: #6a6a6a; /* 어두운 회색 */
        font-weight: bold;
    }
    #main {
        text-align: center;
        margin: 20px;
    }
    #main h1 {
        color: #6a6a6a; /* 어두운 회색 */
    }
    #table {
        width: 90%;
        margin: 0 auto;
        border-collapse: collapse;
        text-align: center;
    }
    #table th, #table td {
        padding: 10px;
        border: 1px solid #ddd; /* 연한 회색 */
    }
    #field {
        background-color: #b3cde0; /* 연한 파란색 */
        color: #333; /* 어두운 회색 */
        font-weight: bold;
    }
    #add {
        background-color: #6a6a6a; /* 어두운 회색 */
        color: white;
        border: none;
        border-radius: 5px;
        padding: 10px 20px;
        cursor: pointer;
    }
    #add:hover {
        background-color: #4a4a4a; /* 더 어두운 회색 */
    }
    #footer {
        background-color: #f7e7d4; /* 연한 베이지색 */
        color: #6a6a6a; /* 어두운 회색 */
        text-align: center;
        padding: 15px;
        position: fixed;
        bottom: 0;
        width: 100%;
        border-top: 2px solid #e0d6c0; /* 살짝 어두운 베이지색 */
    }
    .button {
        display: inline-block;
        padding: 12px 24px;
        margin: 10px;
        border: none;
        border-radius: 5px;
        color: white;
        font-size: 16px;
        cursor: pointer;
        text-align: center;
        text-decoration: none;
        background-color: #6a6a6a; /* 어두운 회색 */
    }
    .button:hover {
        background-color: #4a4a4a; /* 더 어두운 회색 */
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
<%String id= (String)session.getAttribute("id"); %>
<div id='head'>
	<table>
		<tr>
			<td><a href="/ex/main">Home</a></td>
			<td style="text-align: right">
				<%if(id!=null){ %>
					<%=id%>님
			</td>	
			<td>
				<form action="/ex/login/logout">
				<input type="submit" value="Logout" class="button">
				</form>
				<%}else{%>
				<a href="/ex/login/login" class="button">로그인</a>&nbsp;
				<%}%>
			</td>
		</tr>
	</table>
</div>
<div id= 'main'>
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
	<th>STOCK AMOUNT</th>
	<th>ORDER AMOUNT</th>
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
		<td>
			<form action="/ex/Cart/add">
				<input type='number' name='orderAmount'>
				<br>
				<input type='hidden' name='userId' value=<%=id %>>
				<input type='hidden' name='productCode' value='${productDto.productCode}'>
				<input type='submit' id='add' value='장바구니 추가'>
			</form>
		</td> 
		<td>${productDto.status}</td>
	</tr>
	</c:forEach>
	</table>
 <a href="/ex/product/insert" class="button">상품 추가</a>
</div>
<div id='footer'>
    &copy; 2024 Your Website Name. All Rights Reserved.
</div>
</body>
</html>

