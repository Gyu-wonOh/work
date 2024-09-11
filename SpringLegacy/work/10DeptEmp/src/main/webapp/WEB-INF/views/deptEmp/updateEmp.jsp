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
<h1>사원정보 수정</h1>
<form action="/ex/deptEmp/updateEmp" method="post">
<input type=hidden name=empNo value= '${empDto.empNo }'>
사원번호:${empDto.empNo}<br>
영문성명:<input type=text name=enName value='${empDto.enName }' ><br>
직무:<input type="text" name=job value='${empDto.job }'><br>
관리자:<input type="text" name=mgr value='${empDto.mgr }'><br>
입사일자:<input type="text" name=hirDate value='${empDto.hirDate }'><br>
급여:<input type="text" name=sal value='${empDto.sal }'><br>
상여:<input type="text" name=comm value='${empDto.comm }'><br>
부서번호:<input type="text" name=deptNo value='${empDto.deptNo }'><br>
<input type="submit" value=전송 >
</form>
<a href="/ex/deptEmp/selectAll">목록가기</a>
</body>
</html>