<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<h1>Board Website</h1>
		<p>A board website create by me.</p>
	</div>
	<div class="navbar">
		<c:forEach items="${category}" var="item">
			<a href="/ex/board/listAll?bGroupKind=${item}">${item }</a>
		</c:forEach>
		<a href="/ex/board/listAll" class="right">All Category</a>
	</div>
	
	<div class="row">
		<div class="side">
			<a href="/ex/board/listAll" class="right">All Category</a><br>
			<c:forEach items="${category }" var="item">
				<a href="/ex/board/listAll?bGroupKind=${item }">${item }</a><br>
			</c:forEach>
		</div>
		
		<div class="main">
			<div class="box-header">
			<h1 class="box-title">
				새 글쓰기
			</h1>
		</div>
		<!-- /.box-header -->
		<!-- action에 경로가 없으면 현재 페이지 주소로 이동한다. -->
		<form role="form" method="post">
			<h3>
				제목<input type="text" name='bTitle' placeholder="제목입력" style="width:100%">
			</h3>
			<h2>
				카테고리<select name="bGroupKind">
					<option value="공지사항 ">공지사항</option>
					<option value="자유게시판">자유게시판</option>
				</select>
			</h2>
			<h2>
				내용 
				<textarea name="bContent" rows="8" style="width:100%" placeholder="내용입력"></textarea>
			</h2>
			<h2>
				작성자<input type="text" name="bName" placeholder="작성자" style="width:100%">
			</h2>
			<!-- /.box-body -->
			<input type="submit" class="btn btn-primary">글쓰기</button>
		</form>
	</div>
	
	</div>

<div class="footer">
  <h2>Footer</h2>
</div>

</body>
</html>
