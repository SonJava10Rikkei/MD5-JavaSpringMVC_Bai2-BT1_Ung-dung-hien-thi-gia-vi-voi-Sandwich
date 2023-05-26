<%--
  Created by IntelliJ IDEA.
  User: icom
  Date: 5/26/2023
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save" method="post">
    <c:forEach items="${spicesToView}" var="sp">
        <input type="checkbox" name="condiment" value="${sp.name}">
        <label>${sp.name}</label><br>
    </c:forEach>
    <button type="submit">Save</button>
</form>
</body>
</html>
