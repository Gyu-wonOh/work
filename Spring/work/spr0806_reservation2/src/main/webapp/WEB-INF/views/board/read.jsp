<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		var formObj=$("form[role='form']");
		console.log(formObj);
		
		$(".btn-update").on("click",function(){
			formObj.attr("action","/ex/board/modify?");
			formObj.attr("method","get");
			formObj.submit();
		});
		$(".btn-delete").on("click",function(){
			formObj.attr("action","/ex/board/remove");
			formObj.attr("method","get");
			formObj.submit();
		});
		$(".btn-list").on("click",function(){
			self.location="/ex/board/listAll";
		});
	$(".btn-like").on("click",function(){
		formObj.attr("action","/ex/board/like");
		formObj.attr("method","get");
		formObj.submit();
	});
	$(".btn-dislike").on("click",function(){
		formObj.attr("action","/ex/board/dislike");
		formObj.attr("method","get");
		formObj.submit();
	});
	
	$(".btn-reply").on("click", function(){
		formObj.attr("action", "/ex/board/reply");
		formObj.attr("method", "get");		
		formObj.submit();
	});
	
	})
</script>
<style>
body {
	margin: 0;
	font-family: Arial, sans-serif;
	background-color: #f4f4f4; /* 배경색: 연한 회색 */
}

/* Header Styles */
.head {
	background-color: #333; /* 헤더 배경색: 검정색 */
	color: #fff; /* 텍스트 색상: 흰색 */
	padding: 10px;
	text-align: center;
}

.head-title {
	margin: 0;
	font-size: 24px; /* 제목 폰트 크기 */
}

/* Main Container Styles */
.main {
	display: flex;
	margin: 20px auto;
	max-width: 1200px; /* 중앙 정렬 및 최대 폭 설정 */
}

/* Sidebar Styles */
.side {
	width: 250px;
	background-color: #333; /* 사이드바 배경색: 검정색 */
	color: #fff; /* 텍스트 색상: 흰색 */
	padding: 15px;
}

.side a {
	color: #fff; /* 링크 색상: 흰색 */
	text-decoration: none;
	display: block;
	margin: 5px 0;
}

.side a:hover {
	text-decoration: underline; /* 호버 시 밑줄 추가 */
}

/* Content Styles */
.content {
	flex: 1;
	padding: 20px;
	background-color: #fff; /* 콘텐츠 배경색: 흰색 */
	border-radius: 5px; /* 테두리 둥글게 */
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* 박스 그림자 */
}

h1 {
	font-size: 28px;
	margin-bottom: 20px;
}

h2 {
	font-size: 20px;
	margin-bottom: 10px;
}

input[type="text"], textarea {
	width: 100%; /* 전체 너비 사용 */
	padding: 10px; /* 안쪽 여백 */
	border: 1px solid #ccc; /* 테두리 색상 */
	border-radius: 5px; /* 모서리 둥글게 */
	background-color: #f4f4f4; /* 배경색: 연한 회색 */
}

textarea {
	resize: none; /* 크기 조절 비활성화 */
}

/* Button Container Styles */
.btn-container {
	text-align: left;
	margin-top: 20px;
}

button {
	padding: 10px 20px; /* 버튼 안쪽 여백 */
	background-color: #333; /* 버튼 배경색: 검정색 */
	color: #fff; /* 버튼 텍스트 색상: 흰색 */
	border: none; /* 테두리 제거 */
	border-radius: 5px; /* 버튼 모서리 둥글게 */
	cursor: pointer; /* 포인터 커서 */
	margin: 5px; /* 버튼 간격 */
}

button:hover {
	background-color: #555; /* 호버 시 버튼 배경색: 어두운 회색 */
}
</style>
</head>
<body>
	<div class="head">
		<h1 class="head-title">my WebSite</h1>
	</div>
	<div class="main">
	
		<div class="side">
			<a href="/ex/board/listAll">All Category</a>
		</div>
		<div class="content">
			<form role="form" method="post">
				<input type='hidden' name='bId' value="${boardDto.bId}">
			</form>
			<h1>게시글</h1>

			<br>
			<h2>
				글 제목<input type="text" value='${boardDto.bTitle }'
					readonly="readonly">
			</h2>
			<br>
			<h2>
				카테고리<input type="text" value='${boardDto.bGroupKind }'
					readonly="readonly">
			</h2>
			<br>
			<h2>
				내용
				<textarea style="width: 100%" name="bContent" rows="3"
					readonly="readonly">${boardDto.bContent}</textarea>
			</h2>
			<br>

			<h2>
				작성자<input type="text" value='${boardDto.bName }' readonly="readonly">
			</h2>
			<div class="btn-container">
				<button type="submit" class="btn-update">수정</button>
				<button type="submit" class="btn-delete">삭제</button>
				<button type="submit" class="btn-list">전체글 보기</button>
				<button type="submit" class="btn-like">좋아요</button>
				<button type="submit" class="btn-dislike">싫어요</button>
				<button type="submit" class="btn-reply">답글</button>
			</div>
		</div>
		
		
	</div>
	
</body>
</html>