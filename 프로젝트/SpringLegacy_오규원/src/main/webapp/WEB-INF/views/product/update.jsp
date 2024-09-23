<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    #main {
        text-align: center;
        margin: 20px;
        background-color: #f7e7d4; /* 연한 베이지색 */
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1); /* 부드러운 그림자 */
    }
    #main h1 {
        color: #6a6a6a; /* 어두운 회색 */
    }
    form {
        display: inline-block;
        text-align: left;
        max-width: 500px;
        width: 100%;
        background-color: #ffffff; /* 흰색 배경 */
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1); /* 부드러운 그림자 */
        position: relative; /* 버튼을 폼의 절대 위치에 배치하기 위해 필요 */
    }
    form input[type="text"],
    form input[type="file"] {
        width: calc(100% - 20px);
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ddd; /* 연한 회색 */
        border-radius: 5px;
    }
    form input[type="submit"] {
        background-color: #6a6a6a; /* 어두운 회색 */
        color: white;
        border: none;
        border-radius: 5px;
        padding: 10px 20px;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s;
        margin-top: 10px; /* 상단 여백 */
    }
    form input[type="submit"]:hover {
        background-color: #4a4a4a; /* 더 어두운 회색 */
    }
    .button-container {
        position: absolute;
        right: 20px;
        bottom: 20px;
    }
    .button-container button {
        background-color: #6a6a6a; /* 어두운 회색 */
        color: white;
        border: none;
        border-radius: 5px;
        padding: 10px 20px;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s;
    }
    .button-container button:hover {
        background-color: #4a4a4a; /* 더 어두운 회색 */
    }
</style>
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
	 <div class="button-container">
            <a href="/ex/product/selectAll"><button>목록</button></a>
        </div>
</body>
</html>