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
<h1>고객 정보</h1>
<table boarder="1" width="90%" id="customers">
	<tr>
	<th>deptNo</th>
	<th>dName</th>
	<th>loc</th>
	</tr>
	<c:forEach items="${list }" var="deptDto">
	<tr>
		<td><a href='/ex/dept/read?deptNo=${deptDto.deptNo}'>
		${deptDto.deptNo }</a></td>
		<td>${deptDto.dName}</td>
		<td>${deptDto.loc}</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/dept/insert">고객추가</a>
</body>
</html>

