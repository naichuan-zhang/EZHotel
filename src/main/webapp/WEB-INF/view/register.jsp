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
        <%--@elvariable id="guestForm" type="com.cyan.hotel.model.Guest"--%>
        <form:form class="form-register" modelAttribute="guestForm" method="post">
            <h2 class="form-header">Register</h2>
            <spring:bind path="username">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="username" cssClass="form-control" placeholder="Username" autofocus="true"/>
                    <form:errors path="username"/>
                </div>
            </spring:bind>
            
            <spring:bind path="password">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="password" path="password" class="form-control" placeholder="Password"/>
                    <form:errors path="password"/>
                </div>
            </spring:bind>

            <spring:bind path="passwordConfirm">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="password" path="passwordConfirm" class="form-control"
                                placeholder="Confirm your password"/>
                    <form:errors path="passwordConfirm"/>
                </div>
            </spring:bind>

            <spring:bind path="phoneNumber">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="phoneNumber" class="form-control"
                                placeholder="Phone Number"/>
                    <form:errors path="phoneNumber"/>
                </div>
            </spring:bind>

            <spring:bind path="firstName">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="firstName" class="form-control"
                                placeholder="First Name"/>
                    <form:errors path="firstName"/>
                </div>
            </spring:bind>

            <spring:bind path="lastName">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="lastName" class="form-control"
                                placeholder="Last Name"/>
                    <form:errors path="lastName"/>
                </div>
            </spring:bind>

            <spring:bind path="emailAddress">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="emailAddress" class="form-control"
                                placeholder="Email Address"/>
                    <form:errors path="emailAddress"/>
                </div>
            </spring:bind>

            <button class="btn btn-primary btn-block" type="submit">Register</button>
        </form:form>
    </div>

</body>
</html>
