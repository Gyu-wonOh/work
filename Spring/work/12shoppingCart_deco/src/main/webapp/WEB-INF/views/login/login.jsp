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
        border-bottom: 2px solid #e0d6c0; /* 약간 어두운 베이지색 */
    }
    #head a {
        text-decoration: none;
        color: #6a6a6a; /* 어두운 회색 */
        font-weight: bold;
    }
    #main {
        text-align: center;
        margin: 40px auto;
        padding: 20px;
        background-color: #ffffff; /* 흰색 배경 */
        border-radius: 8px; /* 둥근 모서리 */
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* 부드러운 그림자 */
        width: 300px; /* 고정된 너비 */
    }
    #main h1 {
        color: #6a6a6a; /* 어두운 회색 */
    }
    form {
        display: flex;
        flex-direction: column;
        align-items: center;
    }
    input[type="text"],
    input[type="password"] {
        width: 80%;
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #e0d6c0; /* 약간 어두운 베이지색 테두리 */
        border-radius: 5px;
        font-size: 16px;
    }
    #login {
        background-color: #6a6a6a; /* 어두운 회색 */
        color: white;
        border: none;
        border-radius: 5px;
        padding: 10px 20px;
        font-size: 16px;
        cursor: pointer;
        text-align: center;
    }
    #login:hover {
        background-color: #333; /* 더 어두운 회색 */
    }
    #footer {
        background-color: #f7e7d4; /* 연한 베이지색 */
        color: #6a6a6a; /* 어두운 회색 */
        text-align: center;
        padding: 15px;
        border-top: 2px solid #e0d6c0; /* 약간 어두운 베이지색 */
    }
</style>
</head>
<body>
<div id='head'>
	<table>
		<tr>
			<td><a href="/ex/main">Home</a></td>
		</tr>
	</table>
</div>
<div id="main">
	<h1> 로그인</h1>
	<hr/>
	<form action="/ex/login/login" method= post>
		ID:<input type="text" name="id"><br>
		PW:<input type="password" name="pw"><br>
			<input type="submit" id="login" value="login">
	</form>
</div>

<div id="footer">
	 &copy; 2024 Your Website Name. All Rights Reserved.
</div>
</body>
</html>