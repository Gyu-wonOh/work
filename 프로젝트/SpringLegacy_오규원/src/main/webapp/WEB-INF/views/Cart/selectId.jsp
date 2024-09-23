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
</style>
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
				 <form action="/ex/login/logout" style="display: inline;">
                    <input type="submit" value="Logout" class="button">
				</form>
				<%}else{%>
				 <a href="/ex/login/login" class="button">로그인</a>
				<%}%>
			</td>
		</tr>
	</table>
</div>
<div id= 'main'>
<h1>장바구니</h1>
<table  id="table" boarder="1" width="90%" id="customers">
	<tr id="field">
	<th>CartID</th>
	<th>UserID</th>
	<th>ProductCode</th>
	<th>OrderAmount</th>
	<th>Delete</th>
	</tr>
	<c:forEach items="${list }" var="cartDto">
	<tr>
		<td>${cartDto.cartId }</td>
		<td>${cartDto.userId }</td>
		<td>${cartDto.productCode }</td>
		<td>${cartDto.orderAmount}</td>
		<td>
			<form action="/ex/Cart/delete" method="get">
				<input type='hidden' name="cartId" value='${cartDto.cartId}'>
				<input type='submit' value='삭제'>
			</form>
		</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/main" class="button">메인페이지</a>

</div>
<div id="footer">
    &copy; 2024 Your Website Name. All Rights Reserved.
</div>
</body>
</html>

