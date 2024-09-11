<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Control Page</title>
</head>
<body>
    <h1>Control Page</h1>

    <h2>title</h2>
    <p>${title}</p>
    <p>Age: ${age}</p>

    <h2>Human Data List</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Name</th>
                <th>Age</th>
                <th>Height</th>
                <th>Birthday</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="human" items="${list}">
                <tr>
                    <td>${human.name}</td>
                    <td>${human.age}</td>
                    <td>${human.height}</td>
                    <td>
                     <fmt:parseDate value="${human.birthday}" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDate" />
                        <fmt:formatDate value="${parsedDate}" pattern="yyyy-MM-dd HH:mm" />
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <a href="/">Back to Start</a>
</body>
</html>
