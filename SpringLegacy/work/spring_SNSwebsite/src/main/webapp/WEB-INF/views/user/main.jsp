<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		margin:10;
		align: center;
	}
	#head{
		display:flex;
	}
	#introduction{
		margin-left:10px;
	}
	#profile img{
		width:100px;
		height:75px;
	}
	#box{
		border:1px solid lightgray;
		border-radius:5px;
		width:28%;
		padding:30px;
	}
	#main{
		text-align:center;
	}
	#tab img{
		width:55px;
		height:50px;
		margin:5px 20px 20px 5px;
		text-align:center;
	}
	#user_post img{
		width:100px;
		height:100px;
	}
</style>
</head>
<body>
	<div id="box">
		<div id="head">
			<div id ="profile">
				<img src='/ex/resources/img/instagram_logo.PNG'>
			</div>
			<div id ="introduction">
				name<br>
				postCount<br>
				one-line summary
			</div>
		</div>
		<hr/>
		<div id="main">
			<table id= user_post>
				<tr><td><img src="/ex/resources/img/1.jpg"></td><td><img src="/ex/resources/img/2.jpg"></td><td><img src="/ex/resources/img/3.jpg"></td></tr>
				<tr><td><img src="/ex/resources/img/4.jpg"></td><td><img src="/ex/resources/img/5.jpg"></td><td><img src="/ex/resources/img/6.jpg"></td></tr>
				<tr><td><img src="/ex/resources/img/7.png"></td><td><img src="/ex/resources/img/8.jpg"></td><td><img src="/ex/resources/img/9.jpg"></td></tr>
			</table>
		</div>
		<hr/>
		<div id="tab">
			<a href><img src="/ex/resources/img/home-icon.png"></a>
			<a href><img src="/ex/resources/img/search-icon.png"></a>
			<a href><img src="/ex/resources/img/male-icon.png"></a>
			<a href><img src="/ex/resources/img/hamburger-menu-icon.png"></a>
		</div>
	</div>

</body>
</html>