<%--
  Created by IntelliJ IDEA.
  User: Mattias Chang
  Date: 11/2/2019
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
    <c:url value="/main/webapp/resources/main.css" var="jstlCss" />
    <link href="${jstlCss}" rel="stylesheet" />
    <title>Booking</title>
</head>
<body>

<%@ include file="../../resources/nav.jsp" %>
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<br class="container">
    <h1>Booking</h1>
    <div class="select-room-type">
<%--        <form action="list" method="post">--%>
<%--            Select a Room Type:&nbsp;--%>
<%--            <select name="category">--%>
<%--                <c:forEach items="${listCategory}" var="category">--%>
<%--                    <option value="${category.id}"--%>
<%--                            <c:if test="${category.id eq selectedCatId}">selected="selected"</c:if>--%>
<%--                    >--%>
<%--                            ${category.name}--%>
<%--                    </option>--%>
<%--                </c:forEach>--%>
<%--            </select>--%>
<%--            <input type="submit" value="Submit" />--%>
<%--        </form>--%>
<%--    </div>--%>
<%--    <br>--%>
<%--    <div class="pick-date">--%>
<%--        <form action="showDate.jsp">--%>
<%--            <label for="datepicker">Enter date:</label>--%>
<%--            <input type="text" name="selDate" id="datepicker">--%>

<%--            <input type="submit" value="Submit">--%>
<%--        </form>--%>
<%--    </div>--%>
<%--    <form method="post">--%>
<%--        Room Type : <form:select path="">--%>
<%--                    <form:option value="NONE" label="--- Select ---" />--%>
<%--                    <form:options items="${roomTypes}" />--%>
<%--                    </form:select> />--%>
<%--        Number of Guests : <input type="password" name="password" />--%>
<%--        Booking Date: <input type="text">--%>
<%--        <input type="submit" />--%>
<%--    </form>--%>
<%--</div>--%>
    <form:form method="POST" commandName="roomType">
    <table>
        <tr>
            <td>Please select:</td>
            <td><form:select path="roomType">
                <form:option value="" label="...." />
                <form:options items="${roomTypes}" />
            </form:select>
            </td>
            <td><form:errors path="roomType" cssStyle="color: #ff0000;" /></td>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="Submit"></td>
        </tr>
        <tr>
    </table>
    </form:form>


    <script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="../../resources/main.js"></script>
</body>
</html>

