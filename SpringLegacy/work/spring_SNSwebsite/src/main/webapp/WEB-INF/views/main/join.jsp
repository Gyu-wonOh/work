<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Insert title here</title>
<style>
	a img{
		width :280px;
		height : 100px;
	}
	#row{
		text-align :center;
		align: center;
	}
	form{
		border :2px solid lightgray;
		border-radius:5px;
		align : center;
		width: 300px;
		padding:20px;
	}
	#join{
		background-color:lightblue;
		border:0px;
		border-radius:5px;
		color: white;
		width:200px;
		height :50px;
		padding :10px;
	}
	input{ 
		width:200px;
		margin:5px;
	}
</style>
</head>
<body>
	<div id="head"><a href="/ex/main/home"><img src='/ex/resources/img/instagram_logo.PNG'></a></div>
	<div id="row">
		<hr>
		<form action="/ex/user/createUser" method="post">
			<h1 id="title">JOIN</h1>
			Enjoy our contents <br>after create your account!<br><br>
			e-mail <input type="text" name="email"><br>
			phone <input type="text" name="phoneNumber"><br>
			name <input type="text" name="name"><br>
			nickname <input type="text" name="nickname"><br>
			password<input type="password" name="password"><br><br>
			<input type="submit" id="join" value="JOIN">
		</form>
	</div>
	<hr/>
	<div id="footer"></div>
</body>
</html>