<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login to EzHotel</h1>
    <div class="container">
        <div style="color: red; ">${errorMessage}</div>
        <form method="post">
        Username : <label>
            <input type="text" name="name" />
        </label><br>
        Password : <label>
            <input type="password" name="password" />
        </label>
            <br>
        <input type="submit" />
            <%
//                if(null!=request.getAttribute("errorMessage"))
//                {
//                    out.println(request.getAttribute("errorMessage"));
//                    out.println("<p> Error logging in!! </p>");
//                }
            %>

        </form>
<%--    <form:form class="form-register"  method="POST">--%>
<%--        <spring:bind path="userName">--%>
<%--            <div class="form-group ${status.error ? 'has-error' : ''}">--%>
<%--                <form:input type="text" requestAttribute="username" path="userName" class="form-control"--%>
<%--                            placeholder="User Name"/>--%>
<%--                <form:errors path="userName"/>--%>
<%--            </div>--%>
<%--        </spring:bind>--%>

<%--        <spring:bind path="password">--%>
<%--            <div class="form-group ${status.error ? 'has-error' : ''}">--%>
<%--                <form:input type="text" requestAttribute="password" path="password" class="form-control"--%>
<%--                            placeholder="Password"/>--%>
<%--                <form:errors path="password"/>--%>
<%--            </div>--%>
<%--        </spring:bind>--%>
<%--        </form:form>--%>
    </div>
</body>
</html>