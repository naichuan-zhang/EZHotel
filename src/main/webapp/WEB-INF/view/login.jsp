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
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
    <c:url value="/main/webapp/resources/main.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />
    <title>Login</title>
</head>
<body>

    <div class="container">
        <%--@elvariable id="loginForm" type="com.cyan.hotel.model.Guest"--%>
        <form class="form-register" method="post" action="${contextPath}/login">
            <h2 class="form-header">Login</h2>
            <%--@elvariable id="message" type="java.lang.String"--%>
            <%--@elvariable id="error" type="java.lang.String"--%>
            <div class="form-group ${error != null ? 'has-error' : ''}">

                <span>${message}</span>
                <label>
                    <input name="username" type="text" class="form-control" placeholder="Username" autofocus="autofocus"/>
                </label><br>
                <label>
                    <input name="password" type="password" class="form-control" placeholder="Password" autofocus="autofocus"/>
                </label>
                <span>${error}</span>

                <button class="btn btn-primary btn-block" type="submit">Login Now</button>
                <p style="alignment: center">Haven't registered yet? Click here to <b><a href="${contextPath}/register">CREATE AN ACCOUNT</a></b></p>
            </div>
        </form>
    </div>

</body>
</html>
