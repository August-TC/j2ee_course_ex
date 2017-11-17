<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: august
  Date: 17-10-14
  Time: 下午3:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SelectedBeerColor</title>
</head>
<body>
<jsp:include page="Header_ins.jsp"/>
<hr>
<h4>Session List:</h4><hr><br><br>
<%
    Integer count = (Integer) session.getAttribute("itemCount");
    for (int i = 1; i <= count; i++)
    {
        String color = (String) session.getAttribute("Color"+i);
        if(color != null)
        {
            out.println("Color "+i+": ");
        %>

        <%=color%><br>
<%
        }
    }
%>
<%--<c:forEach var="color" items="${sessionlist}">--%>
    <%--${color}<br>--%>
<%--</c:forEach>--%>
</body>
</html>
