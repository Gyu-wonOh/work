<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<%@include file="../include/header.jsp"%>
<div class=main>
<div class="head"><h1>게시판</h1></div>
<div class="body">
	<div class="side">
		<c:forEach items='${category}' var='dto'>
			${dto.bGroupKind}
		</c:forEach>
	</div>
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
			<c:forEach items='${list }' var='boardDto'>
				<tr>
				<td>${boardDto.bGroupKind }</td>
				<td>${boardDto.bId }</td>
				<td><a href="/ex/board/read?bId=${boardDto.bId}">${boardDto.bTitle }</a></td>
				<td>${boardDto.bName }</td>
				<td>${boardDto.bWriteTime }</td>
				<td>${boardDto.bHit }</td>
				<td>${boardDto.bLike }</td>
				<td>${boardDto.bDislike }</td>
				<td>${boardDto.bGroupKind }</td>
				<td>${boardDto.bStep }</td>
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
