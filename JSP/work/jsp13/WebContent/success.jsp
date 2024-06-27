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
 	Cookie[] cookies = request.getCookies();
	String user_id="";
	for(int i =0; i<cookies.length; i++){
		String str=cookies[i].getName();
		if(str.equals("user_id")){
			user_id= cookies[i].getValue();
		}
	}
	if(user_id.equals("")){
		response.sendRedirect("login.jsp?isLogin=false");
	}else{
		out.println("로그인 성공<br>"+user_id+"님 안녕하세요.");
	}
%>
	<form action="Logout.Servlet" method="get">
		<input type="submit" value ="로그아웃">
	</form>
</body>
</html>