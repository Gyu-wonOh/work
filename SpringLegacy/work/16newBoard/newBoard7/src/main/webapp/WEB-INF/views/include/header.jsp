<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Page Title</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="/ex/resources/css/template.css"/>
</head>
<body>

<div class="header">
<a href="/ex/board/listAll"><img src="/ex/resources/img/header.jpg"></a>
</div>

<!-- <div class="navbar">
  <a href="#">Link</a>
  <a href="#">Link</a>
  <a href="#">Link</a>
  <a href="#" class="right">Link</a>
</div> -->
 
<div class="navbar">
    <c:forEach items="${category}" var="item">
        <a href="/ex/sboard/list?bGroupKind=${item}">${item}</a>
    </c:forEach>
    <a href="/ex/sboard/list" class="right">All Category</a>
</div>

<div class="row">
  <div class="side">
    <c:forEach items="${category}" var="item">
        <a href="/ex/sboard/list?bGroupKind=${item}">${item}</a><br>
    </c:forEach>
    <a href="/ex/sboard/list" class="right">All Category</a>
  </div>