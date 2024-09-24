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
	table{
		width:100%;
		border:1px solid #ddd;
		text-align:center;
	}
	table th{
		background-color:green;
	}
	table td{
		background-color:lightgray;
	}
</style>
</head>
<body>
	<div id="head">
		<h1>Read</h1>
	</div>
	<div id="row">
		<table>
			<tr>
			<th>&nbsp;</th><th>id</th><th>name</th><th>age</th><th>height</th><th>birthday</th>
			</tr>
			<tr>
				 <td><a href='/ex/delete?name=${humanDto.name}'>삭제</a></td>
				<td>${humanDto.id}</td>
				<td>${humanDto.name}</td>
				<td>${humanDto.age}</td>
				<td>${humanDto.height}</td>
				<td>${humanDto.birthday}</td>
			</tr>
		</table>
		<a href='/ex/update?id=${humanDto.id}&name=${humanDto.name}&age=${humanDto.age}&height=${humanDto.height}&birthday=${humanDto.birthday}' >수정</a>
	</div>
	<div id="footer"></div>
</body>
</html>