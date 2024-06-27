<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
update.jsp메뉴<br>
update메뉴<br>

<a href="view.do">메인메뉴</a>
<a href="insert.do">insert</a>
<a href="/jsp11frontcontroller/select.do">select</a>
<a href="http://localhost:8088/jsp11frontcontroller/delete.do">delete</a>
<a href="http://localhost:8088
<%=request.getContextPath()%>/update.do">update</a>
</body>
</html>