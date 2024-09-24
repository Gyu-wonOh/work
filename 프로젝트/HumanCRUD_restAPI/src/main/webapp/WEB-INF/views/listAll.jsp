<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#table{
		border:1px solid #ddd;
		width:100%;
		text-align:center;
	}
	#table th{
		background-color:green;
	}
	#table tbody{
		background-color:lightgray;
	}
</style>
</head>
<body>
<div id="head">
	<h1 id="title">HumanCrud</h1>
</div>
<div id="row">
	<table id="table">
		<th>id</th><th>name</th><th>age</th><th>height</th><th>birthday</th>
		<tbody>
			<c:forEach items="${list}" var="humanDto">
				<tr>
					<td>${humanDto.id}</td>
					<td><a href="/ex/selectName?name=${humanDto.name}">${humanDto.name}</a></td>
					<td>${humanDto.age}</td>
					<td>${humanDto.height}</td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${humanDto.birthday}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<button><a href="/ex/insert">새글</a></button>
</div>
<div id ="footer"></div>
</body>
</html>