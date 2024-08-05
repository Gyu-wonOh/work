<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품 정보 수정</h1>
	<hr/>
	<form action="/ex/product/update" method="post">
		상품 이미지: <input type='file' name='productImagePath' value='${productDto.productImagePath }'><br>
		상품코드: <input type='hidden' name='productCode' value='${productDto.productCode}'>${productDto.productCode}<br>
		상품이름: <input type='text' name='productName' value='${productDto.productName}'><br>
		상품가격: <input type='text' name='productPrice' value='${productDto.productPrice}'><br>
		상품설명: <input type='text' name='productDetail' value='${productDto.productDetail}'><br>
		제조사명: <input type='text' name='manufacture' value='${productDto.manufacture}'><br>
		상품분류: <input type='text' name='category' value='${productDto.category}'><br>
		재고수량: <input type='text' name='stockAmount' value='${productDto.stockAmount}'><br>
		상품상태: <input type='text' name='status' value='${productDto.status}'><br>
		<input type='submit' value="수정"><br>
	</form>
	<a href="/ex/product/selectAll"><button>목록</button></a>
</body>
</html>