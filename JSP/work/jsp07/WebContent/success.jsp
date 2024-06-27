<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//이 페이지는  로그인 한 사람만 사용할 수 있는 페이지
	//쿠키를 확인해서 user_id가  키인 쿠키가 존재하면 로그인 상태
	//존재하지 않으면 로그아웃 상태
	//로그인 상태면 현페이지 보여주기 로그아웃 상태면 로그인 페이지 이동하기
	Cookie[] cookies=request.getCookies();
	String user_id="";
	for(int i=0;i<cookies.length;i++){
		String str=cookies[i].getName();
		if(str.equals("user_id")){
			user_id=cookies[i].getValue();
		}
	}
	if(user_id.equals("")){
		response.sendRedirect("login.jsp?islogin=false");
	}else{
		out.println("로그인 성공<br>"+user_id+"님 환영합니다.");
	}
	%>
	
	<form action="LogoutServlet" method="get">
		<input type="submit" value ="로그아웃">
	</form>
</body>
</html>