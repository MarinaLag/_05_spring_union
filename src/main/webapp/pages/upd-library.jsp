
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Update library page</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Update library page:</h1>
    <sf:form method="post" action="/save" modelAttribute="library">
        <sf:input type="hidden" path="id"/><br><br>
        Library name:<sf:input path="name"/><br><br>
        Library address:<sf:input path="address"/><br><br>
        <input  type="submit" value="Update">
    </sf:form>
</body>
</html>
