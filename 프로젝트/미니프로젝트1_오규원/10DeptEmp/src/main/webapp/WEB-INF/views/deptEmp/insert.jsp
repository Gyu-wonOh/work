<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
var result='${msg}';
if(result=='success'){
	alert('처리가 완료되었습니다.');
}
</script>
</head>
<body>
<h1>사원 등록</h1>
	<form action="/ex/deptEmp/insert" method="post">
	부서번호:<input type="text" name="deptNo"><br>
	부서명:<input type="text" name="dName"><br>
	근무지:<input type="text" name="loc"><br>
	사원번호:<input type="text" name="empNo"><br>
	사원성명:<input type="text" name="enName"><br>
	직무:<input type="text" name="job"><br>
	관리자:<input type="text" name="mgr"><br>
	입사일자:<input type="datetime-local" name="hirDate"><br>
	급여:<input type="text" name="sal"><br>
	상여:<input type="text" name="comm"><br>
	<input type="submit" name="등록">
	</form>
</body>
</html>

