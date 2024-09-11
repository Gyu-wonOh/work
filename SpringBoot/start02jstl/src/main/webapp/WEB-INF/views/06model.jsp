<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>DTO Send</title>
</head>
<body>
    <h1>DTO Send Result</h1>
    <p>Name: ${humanDto.name}</p>
    <p>Age: ${humanDto.age}</p>
    <p>Height: ${humanDto.height}</p>
    <p>Birthday: ${humanDto.birthday}</p>
    <p>${result}</p>
</body>
</html>
