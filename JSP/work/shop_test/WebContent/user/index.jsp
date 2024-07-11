<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#headPart{
		background-color:black;
	}
	#head{
		color: white;
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
	<%String id= (String)session.getAttribute("id"); %>
	<div id="headPart">
		<table width="100%">
			<tr id="head">
				<td><a href="/shop_test/main.User">Home</a></td>
				<td><a href="/shop_test/shop/products.Shop">Product</a></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td>
				<%if(id!=null){ %>
				<%=id%>님
				</td>	
				<td>
					<form action="/shop_test/user/logout.User">
						<input type="submit" value="logout">
					</form>
					<%}else{%>
						<a href="/shop_test/user/login.User">로그인</a>&nbsp;
					<%}%>
				</td>
				<td>
					<a href="/shop_test/user/orderList.User">주문내역</a>
					<img src="">
				</td>
				<td><textarea>search</textarea>
					<button>search</button></td>
				<td>&nbsp;</td>
			</tr>
		</table>
	</div>
	
	
	
	<h1>마이 페이지</h1>
	<br>
	<a href="/shop_test/user/update.User"><button>회원정보 수정</button></a>	
	<a href="/shop_test/user/order.User"><button>주문내역</button></a>	
</body>
</html>