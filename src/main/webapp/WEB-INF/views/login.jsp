<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: brina
  Date: 4/10/17
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>


    <c:if test="${not empty message}">
        <div class="msg">
                ${message}
        </div>
    </c:if>


    <form:form method="post" action="/login" modelAttribute="newUser">
        <c:if test="${not empty error}">
            <div class="msg">
                    ${error}
            </div>
        </c:if>
        <form:label path="name">Name</form:label>
        <form:input type="text" path="name"/>

        <form:label path="password">Password</form:label>
        <form:input path="password" type="password"/>
        <button type="submit">Log In</button>
    </form:form>
</body>
</html>
