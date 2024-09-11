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
   이름:${humanDto.name}
   별명:${humanDto.nickName}
   비밀번호:${humanDto.password}
   성별:${humanDto.gender}
   관심분야:<c:forEach var="hobby" items="${humanDto.hobby}">
   ${hobby}
  </c:forEach>
   나이:${humanDto.age}
   생일:${humanDto.birthday}
   이메일:${humanDto.email}
   파일첨부:${humanDto.file}
   자기소개:${humanDto.introduction}
  site:${humanDto.joinScope}
</body>
</html>