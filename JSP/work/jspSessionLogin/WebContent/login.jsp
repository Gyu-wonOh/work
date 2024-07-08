<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	if(<%=request.getParameter("isSuccess")%>==false){
		alert('id 또는 pw를 잘못 입력하셨습니다.')
	}else if(<%=request.getParameter("isLogin")%>==false){
		alert('로그인 후 사용 가능합니다.')
	}else if(<%=request.getParameter("isLogout")%>==true){
		alert('성공적으로 로그아웃 되었습니다.')
	}
</script>
</head>
<body>
	<h1>인사관리 프로그램</h1>
	<form action=loginDB.servlet method="get">
		USER NAME <input type="text" name="user_id"><br>
		PASSWORD <input type="password" name="password" value = 0>
		<input type="submit" value="log-in">
	</form>
</body>
</html>