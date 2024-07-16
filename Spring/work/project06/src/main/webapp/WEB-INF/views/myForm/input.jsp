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
    <form action="/ex/myForm/result">
        <label for="id1">이름 : </label>
        <input type="text" name="name" id="id" size="20" placeholder="이름을 입력해주세요."><br>
        <label for="nickName">별명 : </label>
        <input type="text" name="nickName" id="nickName" size="20" placeholder="별명을 입력해주세요."><br>
        <label for="password">비밀번호 : </label>
        <input type="password" name="password" id="ps1" size="20" placeholder="비밀번호를 입력해주세요."><br>
        <label>성별</label>
        <input type="radio" name="gender" value="man" checked>
        <label for="man">남</label>
        <input type="radio" name="gender" value="woman">
        <label for="woman">여</label><br>
        <label>취미 : </label>
        <input type="checkbox" name="hobby" value="movie">
        <label for="movie">영화</label>
        <input type="checkbox" name="hobby" value="read">
        <label for="read">독서</label>
        <input type="checkbox" name="hobby" value="sports">
        <label for="sports">스포츠</label><br>
        <label for="age">나이 : </label>
        <input type="number" name="age" id="age" size="20" placeholder="나이를 입력해주세요."><br>
        <label for="birthday">생일</label>
        <input type="datetime-local" name="birthday" id="birthday"><br>
        <label for="email">이메일 : </label>
        <input type="email" name="email" id="email" placeholder="이메일을 입력해주세요."><br>
        <label for="file">파일 첨부</label>
        <input type="file" name="file" id="file"><br>
        <label for="myname">자기소개 : </label>
        <textarea name="introduction" id="introduction" rows="10" cols="50" placeholder="200자 이내로 자기 소개를 작성해 주세요."></textarea><br>
        <select name="joinScope" id="joinScope">
            <option value="패밀리사이트">패밀리사이트</option>
        </select><br><br>
        <input type="submit" value="전송">
        <input type="reset" value="다시 쓰기">
    </form>
</body>
</html>