<%--
  Created by IntelliJ IDEA.
  User: Mattias Chang
  Date: 11/2/2019
  Time: 12:11 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
    <c:url value="../../main/webapp/resources/main.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />
    <title>Contact</title>
</head>
<body>

<%@ include file="../../resources/nav.jsp" %>

<div class="container">
    <div class="starter-template">
        <h1>Contact</h1>
    </div>
</div>

<div id="contact">
    <h5>Contact Details:</h5>
    <table class="table table-condensed table-bordered">
        <thead>
            <tr>
                <th>Naichuan Zhang</th>
                <th>18111521@studentmail.ul.ie</th>
            </tr>
            <tr>
                <th>John Long</th>
                <th>12132306@studentmail.ul.ie</th>
            </tr>
        </thead>
    </table>
</div>

<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="../../resources/main.js"></script>
</body>
</html>
