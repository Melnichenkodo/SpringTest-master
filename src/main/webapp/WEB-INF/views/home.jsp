<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: brina
  Date: 4/10/17
  Time: 1:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h1>Hello From Spring Dispatcher Servlet!!!</h1>
<table>
    <h2>Categories</h2>
    <tr>
        <%--<th>Name</th>--%>
        <%--<th>Description</th>--%>
    </tr>
    <c:forEach  var="category" items="${categories}">
        <tr>
            <td>
                <a href="<c:out value="/category?id=${category.id}"/>">
                    <c:out value="${category.name}"/>
                </a>
            </td>
            <%--<td>--%>
                <%--<c:out value="${category.description}" />--%>
            <%--</td>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
