<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		#join {
			color: white;
			background-color: blue;
			border :1px solid blue;
			border-radius: 5px;
		}
		#cancel {
			color:white;
			background-color:gray;
			border:1px solid gray;
			border-radius: 5px;
		}
	</style>
</head>
<body>
<table width="100%">
		<tr id="head">
			<td>Home</td>
			<td>Product</td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>로그인&nbsp;회원가입&nbsp;주문내역</td>
			<td><img src=""></td>
			<td>
			<textarea>search</textarea>
			<button>search</button>
			</td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
		</tr>
		<tr>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td colspan="2">
			<h1 align="center">회원가입</h1>
			</td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
			<td>&nbsp; </td>
		</tr>
		<tr>
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>
			<table>
			<tr><td>아이디</td></tr>
			<tr><td>비밀번호</td></tr>
			<tr><td>비밀번호 확인</td></tr>
			<tr><td>이름</td></tr>
			<tr><td>성별</td></tr>
			<tr><td>생일</td></tr>
			<tr><td>이메일</td></tr>
			<tr><td>전화번호</td></tr>
			<tr><td>주소</td></tr>
			<tr><td><a href="/shop_test/main.User"><button id="cancel">취소</button></a></td></tr>
			</table>
			 </td>		
			<td> 
				
					<table>
						<form action="/shop_test/user/join_pro.User" method="get">
						<tr><td><input type="text" name="id"></td></tr>
						<tr><td><input type="password" name="pw"></td></tr>
						<tr><td><input type="text" name="pwcheck"></td></tr>
						<tr><td><input type="text" name="name"></td></tr>
						<tr>
							<td> 
								<input type="radio" name="gender" value="women">여자
						   		<input type="radio" name="gender" value="men">남자
						   	</td>
					   	</tr>
						<tr><td><input type="datetime-local" name="birthday"></td></tr>
						<tr><td><input type="email" name="email"></td></tr>
						<tr><td><input type="text" name="phoneNumber"></td></tr>
						<tr><td><input type="text" name="address"></td></tr>
						<tr>
							<td>
								<input type="submit" id='join' value="가입">
							</td>
						</tr>
						</form>
					</table>
			</td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
			<td>&nbsp; </td>		
		</tr>
	</table>
</body>
</html>
