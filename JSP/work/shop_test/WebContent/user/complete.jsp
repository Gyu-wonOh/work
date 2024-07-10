<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#head{
		color: white;
		background-color:black;
	}
	#id{
		color:white;
		background-color:blue;
	}
	#join{
		color:white;
		background-color:green;
	}
</style>

</head>
<body>
	<%
	String index = request.getParameter("index");
	String id = (String)session.getAttribute("id");
	%>
	<table width="100%">
		<tr id="head">
			<td>Home</td>
			<td>Product</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td id="id">
				<%=id%>님
				<form action="/shop_test/user/logout.User">
					<input type="submit" value="logout">
				</form>
			</td>
			<td>회원가입</td>
			<td>주문내역</td>
			<td><textarea>search</textarea>
				<button>search</button></td>
			<td>&nbsp;</td>
		</tr>
	</table>
	<h1>회원 정보</h1>
	
	<%if("0".equals(index)){//회원가입
		out.println("회원가입이 완료되었습니다.");
	}else if("1".equals(index)){//로그인 성공
		out.println(id+" 님 환영합니다.");
	%><br>
		<form action= "/shop_test/user/update.User" method="get">
			<input type="hidden" value='${id}'>
			<input type="submit" value="회원정보 수정">
		</form>
		<a href = "/shop_test/user/order.User"><button>주문내역</button></a><br>
	<%
	}else if("2".equals(index)){//회원 정보수정
		out.println("회원정보 수정이 완료되었습니다.");
	}%>
</body>
</html>