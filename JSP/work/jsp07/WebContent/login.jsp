<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
//로그인 실패 했을 경우 login 페이지로 이동한 경우
	if(<%=request.getParameter("isSuccess")%>==false){
		alert('id pw를 잘못 입력');
	}else if(<%=request.getParameter("isSuccess")%>==true){
		alert('로그아웃되었습니다. 로그인페이지로 이동합니다.');	
	}else if(<%=request.getParameter("isLogin")%>==false){
		alert('로그인해야 이용할 수 있는 페이지입니다. 로그인페이지로 이동합니다.');
	}
</script>
</head>
<body>
	<h1>인사관리 프로그램</h1>
	<form action= "LoginServlet" method="get">
	USER NAME<input type="text" name="user_id" autocomplete="off"required><br>
	PASSWORD<input type="password" name="user_pw" autocomplete="off"required>
	<button type="submit" id="btn">LOGIN</button>
	</form>
</body>
</html>