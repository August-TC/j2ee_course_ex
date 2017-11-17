<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: august
  Date: 17-11-3
  Time: 上午9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>item list</title>
</head>
<body><h4>Session List:</h4><hr><br><br>
<c:forEach var="item" items="${sessionScope.items}" varStatus="itemCount">
    ${itemCount.count}: ${item}<hr>
</c:forEach>

</body>
</html>
