<%--
  Created by IntelliJ IDEA.
  User: Mattias Chang
  Date: 11/2/2019
  Time: 12:10 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
    <c:url value="/main/webapp/resources/main.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />
    <title>Room</title>
</head>
<body>

<%@ include file="../../resources/nav.jsp" %>

<div class="container">
    <div class="starter-template">
        <h1>Room</h1>
    </div>
</div>

<label>
    <select name="roomTypesList">
        <%--@elvariable id="roomTypesList" type="com.cyan.hotel.enumeration.RoomStyle"--%>
        <c:if test="${not empty roomTypesList}">
            <c:forEach var="roomType" items="${roomTypesList}">
                <option>${roomType}</option>
            </c:forEach>
        </c:if>
    </select>
</label>

<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="../../resources/main.js"></script>
</body>
</html>
