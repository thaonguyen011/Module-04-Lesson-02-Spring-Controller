<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 26/12/2023
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Email validate</h1>
<h3 style="color: red">${message}</h3>

<form action="${pageContext.request.contextPath}/validate" method="post">
    <label>
        <input type="text" name="email"><br>
    </label>
    <input type="submit" value="Validate">
</form>

</body>
</html>
