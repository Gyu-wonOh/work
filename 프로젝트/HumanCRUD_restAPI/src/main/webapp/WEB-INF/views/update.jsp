<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

</style>
</head>
<body>
	<div id ="head">
		<h1>Update</h1>
	</div>
	<div id ="row">
		<form action="/ex/update" method="post">
			ID:<input type="text" name="id" value="${humanDto.id}" readonly="readonly">
			이름:<input type="text" name="name" value="${humanDto.name}" readonly="readonly">
			나이<input type="text" name="age" value="${humanDto.age}" readonly="readonly">
			키:<input type="text" name="height" value="${humanDto.height}">
			<input type="submit" value="수정">
		</form>
	</div>
	<div id ="footer"></div>
</body>
</html>