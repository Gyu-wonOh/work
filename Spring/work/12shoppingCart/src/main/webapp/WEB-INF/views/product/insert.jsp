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
	<form action="/ex/product/insert" method="post">
		상품 이미지: <input type='file' name='productImagePath'><br>
		상품코드: <input type='text' name='productCode'><br>
		상품이름: <input type='text' name='productName'><br>
		상품가격: <input type='text' name='productPrice'><br>
		상품설명: <input type='text' name='productDetail'><br>
		제조사명: <input type='text' name='manufacture'><br>
		상품분류: <input type='text' name='category'><br>
		재고수량: <input type='text' name='stockAmount'><br>
		상품상태: <input type='text' name='status'><br>
		<input type='submit' value="등록"><br>
	</form>
	<a href="/ex/product/selectAll"><button>목록</button></a>
</body>
</html>