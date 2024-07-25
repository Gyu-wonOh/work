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
<form action="/ex/deptEmp/updateDept" method="post">
<input type=hidden name=deptNo value= '${deptDto.deptNo }'>
부서번호: ${deptDto.deptNo }<br>
부서명:<input type=text name=dName value= '${deptDto.dName }'><br>
근무지:<input type=text name=loc value= '${deptDto.loc }' ><br>
<input type="submit" value=전송 >
</form>
<a href="/ex/deptEmp/selectAll">목록가기</a>
</body>
</html>