<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
   <h1>영문페이지와 한글페이지를 선택하세요.</h1>
  <form>
  <input type="radio" name="language" value="eng">English
  <input type="radio" name="language" value="Kor">한국어
  </form>
</body>
</html>