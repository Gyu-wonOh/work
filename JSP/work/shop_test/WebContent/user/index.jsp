<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		cololr:white;
		background-color:green;
	}
</style>
</head>
<body>
	<table width="100%">
		<tr id="head">
			<td>Home</td>
			<td>Product</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td><a href="/shop_test/user/login.User">로그인</a>&nbsp;<a href="/shop_test/user/join.User">회원가입</a>&nbsp;<a href="/shop_test/user/orderList.User">주문내역</a></td>
			<td><img src=""></td>
			<td><textarea>search</textarea>
				<button>search</button></td>
			<td>&nbsp;</td>
		</tr>
	</table>
	
	<h1>마이 페이지</h1>
	<br>
	<a href="/shop_test/user/update.User"><button>회원정보 수정</button></a>	
	<a href="/shop_test/user/order.User"><button>주문내역</button></a>	
</body>
</html>