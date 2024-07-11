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
	#head {
		color: white;
		background-color: black;
	}
	#update{
		color: white;
		background-color:skyblue;
		border:1px solid skyblue;
		border-radius:5px;
	}
	#delete {
		color: white;
		background-color: red;
		border:1px solid red;
		border-radius: 5px;
	}
</style>
</head>
<body>
	<table>
		<tr id="head">
			<td>Home</td>
			<td>Product</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td colspan="2">
				<form>
					<input type="text" name="search"> <input type="submit"
						value="search">
				</form>
			</td>
		</tr>
		<tr>
			<td><a href="/shop_test/user/index.User">마이페이지</a></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td><a href="/shop_test/user/update.User">회원정보 수정</a></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td>주문내역</td>
			<td></td>
			<td></td>
			<td></td>
			<td colspan="3" rowspan="2"><h1>회원 정보 수정</h1></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>아이디</td>
			<td></td>
			<td rowspan="8">
				<form action="/shop_test/user/update_pro.User" method="get">
					<input type="text" name="id"><br> 
					<input type="text"name="name"><br> 
					<input type="radio" id="gender" value=woman>여자&nbsp;&nbsp;&nbsp; 
					<input type="radio"id="gender" value="man" checked>남자<br> 
					<input type="datetime-local" name="birthday"><br> 
					<input type="email" name="email" value="{email}"> <br> 
					<input type="text" name="phoneNumber" value="${phoneNumber}"><br>
					<input type="text" name="address" value="${address}"><br>
					<input type="submit" id="update" value="수정">
				</form>
			</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>이름</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>성별</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>생일</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>이메일</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>전화번호</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>주소</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td><a href="/shop_test/user/delete.User"><button
						id="delete">탈퇴</button></a></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td>copyrightShop</td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>
</body>
</html>