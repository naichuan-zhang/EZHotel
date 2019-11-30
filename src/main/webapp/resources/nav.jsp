<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="${pageContext.request.contextPath}/">EZ Hotel</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="${pageContext.request.contextPath}/">Home</a></li>
                <li><a href="${pageContext.request.contextPath}/room">Room</a></li>
                <li><a href="${pageContext.request.contextPath}/event">Event</a></li>
                <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
                <li><a href="${pageContext.request.contextPath}/about">About</a></li>
            </ul>
            <div id="loginAndRegister">
                <%--@elvariable id="login" type="java.lang.String"--%>
                <c:if test="${login == 'true'}">
                    <ul class="nav navbar-nav navbar-right">
                        <li><p style="color: #cccccc">Welcome <%--@elvariable id="username" type="java.lang.String"--%>
                            <c:out value="${username}"/>!</p></li>
                        <li><button type="button" class="btn btn-link" onclick="location.href='/home'">Logout</button></li>
                    </ul>
                </c:if>
                <c:if test="${login != 'true'}">
                    <ul class="nav navbar-nav navbar-right">
                        <li><button type="button" class="btn btn-link" onclick="location.href='/register'">Register</button></li>
                        <li><button type="button" class="btn btn-primary" onclick="location.href='/login'">Login</button></li>
                    </ul>
                </c:if>
            </div>
        </div>
    </div>
</nav>