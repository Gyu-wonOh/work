<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
    #head form {
        display: inline;
    }
    #main {
        text-align: center;
        margin: 20px;
    }
    #main h1 {
        color: #6a6a6a; /* 어두운 회색 */
    }
    .button {
        display: inline-block;
        padding: 15px 30px; /* 버튼의 크기 증가 */
        margin: 10px;
        border: none;
        border-radius: 8px; /* 둥근 모서리 */
        color: white;
        font-size: 18px; /* 폰트 크기 증가 */
        cursor: pointer;
        text-align: center;
        text-decoration: none;
    }
    #login {
        background-color: #b3cde0; /* 연한 파란색 */
    }
    #productLists{
    	background-color: #f6a4a4; /* 연한 핑크색 */
    	}
    #logout {
        background-color: #f6a4a4; /* 연한 핑크색 */
    }
    #cart {
        background-color: #c5e1a5; /* 연한 연두색 */
    }
    #join {
        background-color: #c5e1a5; /* 연한 연두색 */
    }
    #cart {
        background-color: #d0a9f5; /* 연한 보라색 */
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
</style>

</head>
<body>
	<%String id= (String)session.getAttribute("id"); %>
	<div id='head'>
		<table>
			<tr>
				<td><a href="/ex/main">Home</a></td>
				<td style="text-align: right;">
				<%if(id!=null){ %>
					<%=id%>님
				</td>	
				<td>
					 <form action="/ex/login/logout" style="display:inline;">
                        <input type="submit" value="Logout" class="button" id="logout">
                    </form>
				<%}else{%>
					 
				<%}%>
				</td>
			</tr>
		</table>
	</div>
	<div id='main'>
		<h1 id='mainHead' align="center">Shopping mall</h1>
		<hr/>
		<h2 align="center"> 메인 화면입니다.</h2>
		<%if(id!=null){%>
			 <a href="/ex/product/selectAll" class="button" id="productLists">상품목록</a><br>
			 <a href="/ex/Cart/selectId" class="button" id="cart">장바구니</a><br>
		<%} else {%>
		 			<a href="/ex/login/login" class="button" id="login">Log In</a>
                    <a href="/ex/login/join" class="button" id="join">Join</a>
		<%}%>
	</div>
	<div id="footer">
        &copy; 2024 Your Website Name. All Rights Reserved.
    </div>
</body>
</html>