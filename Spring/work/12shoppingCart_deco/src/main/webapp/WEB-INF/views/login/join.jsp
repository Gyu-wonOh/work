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
        background-color: #f4f4f4; /* 연한 회색 배경 */
    }
    #head {
        background-color: #f7e7d4; /* 연한 베이지색 */
        padding: 15px;
        border-bottom: 2px solid #e0d6c0; /* 살짝 어두운 베이지색 */
        text-align: center;
    }
    #head a {
        text-decoration: none;
        color: #6a6a6a; /* 어두운 회색 */
        font-weight: bold;
        font-size: 16px;
    }
    #main {
        background-color: #ffffff; /* 흰색 배경 */
        margin: 20px auto;
        padding: 20px;
        border-radius: 8px; /* 둥근 모서리 */
        width: 100%;
        max-width: 600px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1); /* 부드러운 그림자 */
        text-align: center;
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
    input[type="password"], 
    input[type="email"], 
    input[type="datetime-local"] {
        width: 90%; /* 폼 필드의 폭을 100%로 설정 */
        max-width: 400px; /* 최대 폭을 400px로 제한 */
        margin: 10px 0;
        padding: 10px;
        border: 1px solid #ddd; /* 연한 회색 */
        border-radius: 5px;
        background-color: #f9f9f9; /* 아주 연한 베이지색 */
    }
    input[type="radio"] {
        margin: 0 10px;
    }
    .submit-btn {
        background-color: #e0d6c0; /* 살짝 어두운 베이지색 */
        color: #333; /* 어두운 회색 */
        border: none;
        border-radius: 5px;
        padding: 12px 24px;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s;
        margin-top: 10px;
    }
    .submit-btn:hover {
        background-color: #d0c3b5; /* 더 어두운 베이지색 */
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
<div id='head'>
	<table>
		<tr>
			<td><a href="/ex/main">Home</a></td>
		</tr>
	</table>
</div>
<div id="main">
	<h1> 회원가입</h1>
	<hr/>
	<form action="/ex/login/complete" method= post>
		ID:<input type="text" name="id"></label><br>
		PW:<input type="password" name="pw"><br>
		이름:<input type="text" name="name"><br>
		성별:
		&nbsp;남자<input type="radio" name="gender" value="남자">&nbsp;여자<input type="radio" name="gender" value="여자">
		생일:<input type="datetime-local" name="birthday" ><br>
		이메일:<input type="text" name="email" ><br>
		전화번호:<input type="text" name="phoneNumber"><br>
		주소:<input type="text" name="address"><br>
			 <input type="submit" class="submit-btn" value="가입">
	</form>
</div>

<div id="footer">
    &copy; 2024 Your Website Name. All Rights Reserved.
</div>
</body>
</html>