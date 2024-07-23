<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/ex/dept/modify" method="post">
<input type=hidden name=deptNo value= '${deptDto.deptNo }'>
부서번호: ${deptDto.deptNo }
부서명:<input type=text name=dName value= '${deptDto.dName }'><br>
지역:<input type=text name=loc value= '${deptDto.loc }' ><br>
<input type="submit" value=전송 >
</form>
<a href="/ex/dept/selectAll">목록가기</a>
</body>
</html>