<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>공지사항</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color:white; /* 따뜻한 배경색 */
        }
        #head {
            background-color: #ff6f61; /* 따뜻한 색상 */
            color: white;
            padding: 15px;
            text-align: center;
        }
        #head img {
            max-width: 100px;
            height: auto;
        }
        #main {
            display: flex;
            margin: 20px;
        }
        #sidebar {
            width: 200px;
            padding: 15px;
            background-color: #fff5e6; /* 따뜻한 색상 */
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            margin-right: 20px;
        }
        #sidebar h2 {
            font-size: 18px;
            color: #ff6f61; /* 따뜻한 색상 */
        }
        #sidebar ul {
            list-style-type: none;
            padding: 0;
        }
        #sidebar ul li {
            margin: 10px 0;
        }
        #sidebar ul li a {
            text-decoration: none;
            color: #333;
            font-size: 16px;
        }
        #sidebar ul li a:hover {
            color: #ff6f61; /* 따뜻한 색상 */
        }
        #content {
            flex-grow: 1;
            background-color: #fff;
            padding: 15px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #ff6f61; /* 따뜻한 색상 */
            color: white;
        }
        #footer {
            background-color: #ff6f61; /* 따뜻한 색상 */
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>
    <div id="head">
        <div>웹페이지 로고</div>
        <h1>공지사항</h1>
        <img src="path/to/logo.png" alt="웹페이지 로고" />
    </div>
    <div id="main">
        <div id="sidebar">
            <h2>게시물 분류</h2>
            <ul>
                <li><a href="#">공지사항</a></li>
                <li><a href="#">이벤트</a></li>
                <li><a href="#">자유게시판</a></li>
                <li><a href="#">Q&A</a></li>
            </ul>
        </div>
        <div id="content">
            <p>공지사항</p>
            <table>
                <thead>
                    <tr>
                        <th>No.</th>
                        <th>글제목</th>
                        <th>작성자</th>
                        <th>작성일</th>
                        <th>조회</th>
                        <th>좋아요</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>글번호</td>
                        <td>글제목</td>
                        <td>작성자</td>
                        <td>작성일</td>
                        <td>1</td>
                        <td>1</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div id="footer">
        © 2024 웹사이트 이름
    </div>
</body>
</html>
