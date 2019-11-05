<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
    <c:url value="/main/webapp/resources/main.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />
    <title>Home</title>
</head>
<body>

    <%@ include file="../../resources/nav.jsp" %>

    <div class="container">
        <div class="starter-template">
            <h1>Home</h1>
        </div>
    </div>

    <script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="../../resources/main.js"></script>
</body>
</html>