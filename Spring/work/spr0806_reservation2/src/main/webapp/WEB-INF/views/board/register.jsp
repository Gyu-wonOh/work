<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<%@include file="../include/header.jsp"%>
<div class=main>
<div class="body">
	<div class="side">
		<c:forEach items='${category}' var='dto'>
			<p>${dto.bGroupKind}</p>
		</c:forEach>
	</div>
	<div class="row">
		
		<h1>새 글쓰기</h1>
		<form action="/ex/board/register" method="post">
		<h2>제목</h2><br><input type="text" id='bTitle' value="제목입력">
		<h2>카테고리</h2><select></select>
		<h2>내용</h2><br><input type="text" id='bContents' value="내용 입력">
		<h2>작성자</h2><br><input type="text" id='bName' value="작성자"><br>
		<input type="submit" value="글쓰기">
		</form>
	</div>
</div>

</div>
<%@include file="../include/footer.jsp"%>