<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login to EzHotel</h1>
<br>
    <div>
        <font color="red">${errorMessage}</font>
        <form method="post">
        Username : <label>
            <input type="text" name="name" />
        </label><br>
        Password : <label>
            <input type="password" name="password" />
        </label>
            <br>
        <input type="submit" />
        </form>
    </div>
</body>
</html>