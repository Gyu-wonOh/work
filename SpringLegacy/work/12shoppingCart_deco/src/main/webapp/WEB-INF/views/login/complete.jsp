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
    #main h2 {
        color: #6a6a6a; /* 어두운 회색 */
    }
    .button {
        display: inline-block;
        padding: 15px 30px; /* 버튼 크기 조정 */
        margin: 10px;
        border: none;
        border-radius: 8px; /* 둥근 모서리 */
        color: white;
        font-size: 16px;
        cursor: pointer;
        text-align: center;
        text-decoration: none;
    }
    #home {
        background-color: #b3cde0; /* 연한 파란색 */
    }
    #member {
        background-color: #c5e1a5; /* 연한 연두색 */
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
	<h1> 회원가입 완료</h1>
	<hr/>
	<h2>회원 가입이 완료되었습니다.</h2><br>
	 <a href="/ex/main" class="button" id="home">메인으로 이동</a><br>
</div>

<div id="footer"></div>
</body>
</html>