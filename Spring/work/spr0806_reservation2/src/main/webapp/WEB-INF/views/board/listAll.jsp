<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>게시판</title>
<link rel="stylesheet" href="../resources/css/styles.css">
<style>
/* General Styles */
body {
	margin: 0;
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
}

/* Header Styles */
.header {
	background-color: #333; /* Black background for the header */
	color: #fff;
	padding: 10px 0;
	position: fixed;
	width: 100%;
	top: 0;
	left: 0;
	z-index: 1000;
}

.header-content {
	max-width: 1200px;
	margin: 0 auto;
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 0 20px;
}

.logo {
	font-size: 24px;
}

.nav-menu a {
	color: #fff;
	text-decoration: none;
	margin: 0 10px;
}

.nav-menu a:hover {
	text-decoration: underline;
}

/* Main Container Styles */
.main-container {
	display: flex;
	margin-top: 60px; /* To avoid overlap with fixed header */
}

.sidebar {
	width: 250px;
	background-color: #333; /* Black background for the sidebar */
	color: #fff;
	padding: 15px;
}

.side-content {
	margin-bottom: 20px;
}

.head {
	background-color: #444; /* Dark gray for the head */
	padding: 10px;
	border-radius: 5px;
	margin-bottom: 20px;
}

.head h1 {
	margin: 0;
	font-size: 20px;
}

.sidebar a {
	color: #fff;
	text-decoration: none;
	display: block;
	margin: 5px 0;
}

.sidebar a:hover {
	text-decoration: underline;
}

/* Content Styles */
.content {
	flex: 1;
	padding: 20px;
	background-color: #fff;
}

.row {
	margin-bottom: 20px;
}

table {
	width: 100%;
	border-collapse: collapse;
}

th, td {
	border: 1px solid #ddd;
	padding: 8px;
	text-align: left;
}

th {
	background-color: #f4f4f4;
}

.btn-container {
	text-align: right;
}

button {
	padding: 10px 15px;
	background-color: #333; /* Dark button color */
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

button:hover {
	background-color: #555; /* Lighter button color on hover */
}

/* Footer Styles */
footer {
	background-color: #333; /* Black background for the footer */
	color: #fff;
	text-align: center;
	padding: 10px 0;
	position: fixed;
	width: 100%;
	bottom: 0;
	left: 0;
}
</style>
</head>
<body>
	<header class="header">
		<div class="header-content">
			<div class="logo">MyWebSite</div>
			<nav class="nav-menu">
				<a href="/ex/board/listAll">All Category</a> <a href="#">공지사항</a>
				<!-- Add more menu items here -->
			</nav>
		</div>
	</header>

	<div class="main-container">
		<div class="sidebar">
			<div class="side-content">
				<a href="/ex/board/listAll" class="right">All Category</a><br>
				<c:forEach items="${category}" var="item">
					<a href="/ex/board/listAll?bGroupKind=${item}">${item}</a>
					<br>
				</c:forEach>
			</div>
		</div>

		<div class="content">
		<h1>게시판</h1>
			<div class="row">
				<table>
					<tr>
						<th>카테고리</th>
						<th>번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성 시간</th>
						<th>조회수</th>
						<th>좋아요</th>
						<th>싫어요</th>
						<th>그룹 종류</th>
						<th>단계</th>
					</tr>
					<c:forEach items="${list}" var="boardDto">
						<tr>
							<td>${boardDto.bGroupKind}</td>
							<td>${boardDto.bId}</td>
							<td>
								<c:forEach begin="1" end="${boardDto.bIndent }">&nbsp;&nbsp;&nbsp;</c:forEach>
								<c:if test="${boardDto.bIndent!=0 }">re:</c:if>
								<a href="/ex/board/read?bId=${boardDto.bId}">${boardDto.bTitle }</a>
							</td>
							<td>${boardDto.bName}</td>
							<td>${boardDto.bWriteTime}</td>
							<td>${boardDto.bHit}</td>
							<td>${boardDto.bLike}</td>
							<td>${boardDto.bDislike}</td>
							<td>${boardDto.bGroup}</td>
							<td>${boardDto.bStep}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<div class="btn-container">
				<button id="btn-create" onclick="location.href='/ex/board/register'">글쓰기</button>
			</div>
		</div>
	</div>

	<%@include file="../include/footer.jsp"%>
</body>
</html>
