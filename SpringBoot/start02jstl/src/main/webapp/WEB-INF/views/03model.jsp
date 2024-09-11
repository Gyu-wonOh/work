<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Model 3</title>
</head>
<body>
    <h1>Model 3 Page</h1>

    <h2>Map Data</h2>
    <p>Key 1: ${mapdata.key1}</p>
    <p>Key 2: ${mapdata.key2}</p>
    <p>Key 3: ${mapdata.key3}</p>

    <h2>Human Data</h2>
    <p>Name: ${humanDto.name}</p>
    <p>Age: ${humanDto.age}</p>
    <p>Height: ${humanDto.height}</p>
    <fmt:parseDate value="${humanDto.birthday}" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDate" />
    <p>Birthday: <fmt:formatDate value="${parsedDate}" pattern="yyyy-MM-dd HH:mm:ss" /></p>

    <h2>JavaScript Data</h2>
    <p>Message: ${message}</p>
    <script>
        let msg = "${message}";
        if (msg !== null && msg !== "") {
            alert(msg);
        }
    </script>
    <h2>Tag Data</h2>
    <div>${titleStr}</div>
    <div><c:out value="${titleStr}" /></div>
    <a href="/">Back to Start</a>
</body>
</html>
