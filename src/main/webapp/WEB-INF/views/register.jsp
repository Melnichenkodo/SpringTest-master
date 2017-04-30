<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
 Created by IntelliJ IDEA.
 User: Bogdan
 Date: 27.04.2017
 Time: 19:20
 To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form:form method="post" action="/register" modelAttribute="newUser">
    <%--<c:if test="${not empty error}">--%>
        <%--<div class="msg">--%>
                <%--${error}--%>
        <%--</div>--%>
    <%--</c:if>--%>
    <form:label path="name">Name</form:label>
    <form:input type="text" path="name"/>

    <form:label path="password">Password</form:label>
    <form:input path="password" type="password"/>
    <button type="submit">Register</button>
</form:form>

</body>
</html>