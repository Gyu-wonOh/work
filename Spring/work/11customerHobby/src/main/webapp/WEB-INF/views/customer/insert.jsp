<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/ex/customer/insert" method="post">
이름:<input type=text name=name ><br>
키:<input type=text name=height ><br>
생일:<input type="datetime-local" name=birthday ><br>
<input type="submit" value=전송 >
</form>

</body>
</html>