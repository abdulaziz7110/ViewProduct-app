<%--@elvariable id="productList" type=""--%>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 9/15/2022
  Time: 4:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>product</title>
</head>
<body>
    <c:forEach>
    <h1>${productList.getName()}</h1>
    </c:forEach>
</body>
</html>
