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
                <li><a href="${pageContext.request.contextPath}/booking">Booking</a></li>
                <li><a href="${pageContext.request.contextPath}/contact">Contact</a></li>
                <li><a href="${pageContext.request.contextPath}/about">About</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><button type="button" class="btn btn-link" onclick="location.href='/register'">Register</button></li>
                <li><button type="button" class="btn btn-primary" onclick="location.href='/login'">Login</button></li>
            </ul>
        </div>
    </div>
</nav>