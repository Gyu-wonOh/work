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

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	var result = '${msg}';
	if (result == 'success') {
		alert("처리가 완료되었습니다.");
	}
	$(document).ready(function(){
		$(".btn").on("click", function(){
			location.href="/ex/board/register"
		});
		$('#searchBtn').on("click",function(event){
			  alert("listAll"+'${boardVo.makePage(1)}'
					  +'&searchType='+$("select option:selected").val()
					  +"&keyword="+$('#keywordInput').val());
			  
			  window.location.href= "listAll"+'${boardVo.makePage(1)}'
			  +'&searchType='+$("select option:selected").val()
			  +"&keyword="+$('#keywordInput').val();
	  })
	  $('.writeBtn').on("click",function(event){
		  location.href="/ex/board/register";
	  });
		$('#newBtn').on("click",function(event){
		  self.location="register";
	  });
	});
		  
</script>
<title>Insert title here</title>
</head>
<body>

	<div class="header">
		<h1>Board Website</h1>
		<p>A board website created by me.</p>
	</div>

	<div class="navbar">
		<c:forEach items="${category }" var="item">
			<a href="/ex/board/listAll?bGroupKind=${item }">${item }</a>
		</c:forEach>
		<a href="/ex/board/listAll" class="right">All Category</a>
	</div>
	<div class="row">
		<div class="side">
			<a href="/ex/board/listAll" class="right">All Category</a><br>
			<c:forEach items="${category }" var="item">
				<a href="/ex/board/listAll?bGroupKind=${item }&categoryType=${item}">${item}</a><br>
			</c:forEach>
		</div>

		<div class="main">
			<c:if test = "${empty param.bGroupKind }">
				전체글보기
			</c:if>
			<c:if test = "${not empty param.bGroupKind }">
				${param.bGroupKind }
			</c:if>
			<h1></h1>
			<h1></h1>
			<h1></h1>
			<h1></h1>
			<div class="horizontal-line"></div>
			<table id='customers' width=100% border="1">
				<div>
					<select name="searchType">
						<option value="----"<c:out value="${boardVo.searchType eq '----'? 'selected':'' }"/>>----</option>
						<option value="카테고리" <c:out value="${boardVo.searchType eq '카테고리'? 'selected':'' }"/>>카테고리</option>
						<option value="작성자" <c:out value="${boardVo.searchType eq '작성자'? 'selected':'' }"/>>작성자</option>
					</select>
					<!-- input 에 text를 입력하면 value로 설정된 pageMaker에 keyword의 값이 id 값으로 들어간다.
					입력 값이  쿼리 스트링에 들어간다. -->
					<input type="text" name="keyword" id="keywordInput" value="${boardVo.keyword }">
					<button id="searchBtn">검색하기</button>
					<button id="newBtn">새글</button>
				</div>
					<tr>
						<th style="width: 175px">카테고리</th>
						<th style="width: 80px">번호</th>
						<th style="width: 300px">제목</th>
						<th style="width: 140px">작성자</th>
						<th style="width: 200px">작성일</th>
						<th style="width: 80px">조회</th>
						<th style="width: 130px">좋아요</th>
						<th style="width: 60px">bGroup</th>
						<th style="width: 60px">bStep</th>
						<th style="width: 60px">bIndent</th>
					</tr>
					<c:forEach items="${list }" var="boardDto">
						<tr>
							<td>${boardDto.bGroupKind }</td>
							<td>${boardDto.bId }</td>
							<td>
								<c:forEach begin="1" end="${boardDto.bIndent }">&nbsp;&nbsp;&nbsp;</c:forEach>
								<c:if test="${boardDto.bIndent!=0 }">re:</c:if>
								<a href="/ex/board/read?bId=${boardDto.bId }">${boardDto.bTitle }</a>
							</td>
							<td>${boardDto.bName }</td>
							<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardDto.bWriteTime }"/></td>	
							<td><span class="badge bg-red">${boardDto.bHit }</span></td>
							<td>${boardDto.bLike }</td>
							<td>${boardDto.bGroup }</td>
							<td>${boardDto.bStep }</td>
							<td>${boardDto.bIndent }</td>
						</tr>
					</c:forEach>
			</table>
			<button class="writeBtn">글쓰기</button>
			<div class="pagination">
				<c:if test="${boardVo.page !=1}">
					<a href='listAll${boardVo.makeSearch(1)}'>&lt;&lt;&lt;</a>
				</c:if>
				<!-- 앞의 page 모양을 클릭하면 pageMaker.startPage에 -1을 처리해준다. -->
				<c:if test="${boardVo.prev }">
					<a href='listAll${boardVo.makeSearch(boardVo.startPage-1)}'>&lt;&lt;</a>
				</c:if>
				<c:if test="${boardVo.page !=1 }">
					<a href ='listAll${boardVo.makeSearch(boardVo.page-1)}'>&lt;</a>
				</c:if>
				<c:forEach begin="${boardVo.startPage}" end="${boardVo.endPage}" var="idx">
			        <c:set var="pageUrl" value="listAll${boardVo.makePage(idx)}"/>
			        <c:if test="${not empty boardVo.bGroupKind}">
			            <c:set var="pageUrl" value="${pageUrl}&categoryType=${boardVo.bGroupKind}"/>
			        </c:if>
			        <a href="${pageUrl}" <c:out value="${boardVo.page == idx ? 'class=active' : '' }"/>>
			            ${idx}
			        </a>
			    </c:forEach>
				<c:if test="${boardVo.page != boardVo.totalEndPage}">
	    		<a href='listAll${boardVo.makeSearch(boardVo.page+1)}'>&gt;</a>
		    	</c:if>
		    	<c:if test="${boardVo.next }">
		    		<a href='listAll${boardVo.makeSearch(boardVo.endPage+1)}'>&gt;&gt;</a>
		    	</c:if>
		    	<c:if test="${boardVo.page != boardVo.totalEndPage}">
		    		<a href='listAll${boardVo.makeSearch(boardVo.totalEndPage)}'>&gt;&gt;&gt;</a>
		    	</c:if>
			</div>
		</div>
	
	</div>

<div class="footer">
  <h2>Footer</h2>
</div>
</body>
</html>