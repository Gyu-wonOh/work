<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board List All</title>
</head>
<style>
	#head{
		border:1px solid;
		background-color:lightgreen;
		text-align:center;
	}
	#main{
		display:flex;
		width:100%;
	}
	
	#sidebar{
		width:20%;
		background-color: darkgreen;
		color:white;
		border:1px solid;
		border-radius:5px;
	}
	#section{
		width:80%;
	}
</style>
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$(".create").on("click",function(){
	location.href="/ex/board/create";
	});
	
	
});
	
</script>
<body>
	<div id='head'><h1 class= 'title'>게시판</h1></div>
	<div id='main'>
		<div id='sidebar'>
			<c:forEach items='${category }' var='category'>
				${category}<a></a><br>
			</c:forEach>
		</div>
		<div id='section'>
			<table id= 'post'>
				<th>No.</th><th>카테고리</th><th>게시물 제목</th><th>글쓴이</th><th>작성시간</th><th>조회수</th>
					<c:forEach items='${list }' var='dto'>
						<tr>
							<td>${dto.bId }</td>
							<td>${dto.bGroupkind }</td>
							<td><a href="/ex/board/read?bId='${bId }'">${dto.bTitle }</a></td>
							<td>${dto.bName }</td>
							<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value='${dto.bWriteTime }'/></td>
							<td>${dto.bHit }</td>
						</tr>					
					</c:forEach>
			</table>
			<button class="create">글쓰기</button>
		</div>
	</div>
	<div id='footer'></div>
</body>
</html>