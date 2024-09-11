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
        background-color: #f7e7d4; /* 연한 베이지색 */
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1); /* 부드러운 그림자 */
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
    button {
        background-color: #6a6a6a; /* 어두운 회색 */
        color: white;
        border: none;
        border-radius: 5px;
        padding: 10px 20px;
        font-size: 16px;
        cursor: pointer;
        text-align: center;
        text-decoration: none;
        margin: 5px;
        transition: background-color 0.3s;
    }
    button:hover {
        background-color: #4a4a4a; /* 더 어두운 회색 */
    }
    .button-container {
        margin-top: 20px;
        text-align: center;
    }
</style>
</head>

<body>
	<h1>상품 상세 정보</h1>
	  <table id="table" border="1">
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
</table><br>
 <div class="button-container">
            <a href="/ex/product/update?productCode=${productDto.productCode}"><button>수정</button></a>
            <a href="/ex/product/delete?productCode=${productDto.productCode}"><button>삭제</button></a>
            <a href="/ex/product/selectAll"><button>목록</button></a>
        </div>
</body>
</html>