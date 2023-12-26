<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 26/12/2023
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Condiment</title>
</head>
<body>
<h1>Condiments</h1>
<c:forEach items="${condiments}" var="condiment">
  <p>${condiment}</p>
</c:forEach>

</body>
</html>
