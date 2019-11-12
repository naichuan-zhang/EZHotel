<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mattias Chang
  Date: 11/2/2019
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
    <c:url value="/main/webapp/resources/main.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />
    <link href="<c:url value="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"/>" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Register</title>
</head>
<body>

    <div class="container">
        <h2 class="form-header">Register</h2>
        <form id="register" action="register" method="post">
            <label>Username: ${user.username}</label>
            <input type="text" name="username">
            <br/>
            <label>Password: ${user.password}</label>
            <input type="text" name="password">
            <br/>
            <label>Confirm Password: ${user.confirmPassword}</label>
            <input type="text" name="username">
            <br/>
            <label>Phone Number: ${user.phoneNumber}</label>
            <input type="text" name="username">
            <br/>
            <label>First Name: ${user.firstName}</label>
            <input type="text" name="username">
            <br/>
            <label>Last Name: ${user.lastName}</label>
            <input type="text" name="username">
            <br/>
            <label>Email: ${user.email}</label>
            <input type="text" name="username">
            <br/>
            <button class="btn btn-primary">Register</button>
        </form>
    </div>


</body>
</html>
