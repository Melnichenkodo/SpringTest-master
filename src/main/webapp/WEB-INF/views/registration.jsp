<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Bogdan
  Date: 22.04.2017
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form:form action="/registration" method="post" modelAttribute="newUser">
    <h2 class="form-signin-heading" style="text-align: center">Registration page</h2>

    <div>
        <form:label path="name">Name</form:label>
        <form:input path="name"/>
    </div>

    <div>
        <form:label path="password">Password</form:label>
        <form:input type="password" path="password"/>
    </div>

    <br/>

    <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>

</form:form>
<form action="<c:url value="/"/>" class="form-signin">

    <input type="submit" class="btn btn-lg btn-primary btn-block" value="Cancel"/>
</form>

</body>
</html>
