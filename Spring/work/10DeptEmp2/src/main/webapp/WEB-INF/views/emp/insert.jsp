<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/ex/emp/insert" method="post">
사원번호<input type=text name=empNo ><br>
영문성명:<input type=text name=enName ><br>
직무:<input type="text" name=job ><br>
관리자:<input type="text" name=mgr ><br>
입사일자:<input type="text" name=hirDate ><br>
급여:<input type="text" name=sal ><br>
상여:<input type="text" name=comm ><br>
부서번호:<input type="text" name=deptNo ><br>
<input type="submit" value=전송 >
</form>

</body>
</html>