<!DOCTYPE html>
<html>
<head>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.2/jquery.min.js"></script>
    <script src="http://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.2/modernizr.js"></script>
    <script>
        $(window).load(function() {
            $(".se-pre-con").fadeOut(1500);
        });
    </script>
    <title>Registration | EZ Hotel </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/registration.css">
    <link rel="stylesheet"href="../../css/commonStyle.css">



    <link href='https://fonts.googleapis.com/css?family=Inconsolata' rel='stylesheet'>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!--    <script src="../javascript/register.js" type="text/javascript"></script>-->
</head>
<body>
<div class="se-pre-con"></div>
<div class="container">
    <div class="logoImage">
        <img class="resize" src="../../images/hotel-logo.png">
    </div>
    <hr>

</div>
<div id="error" style="float:right;color:red;visibility:hidden;">Inputs must not be empty.</div>
<div style="margin-left:23%;">
    <p><span class="desc">First Name: </span><input id="firstName" type="text">
        <span class="desc">Surname: </span><input id="surname" type="text"></p>
    <span class="desc">Email: </span><input id="email" type="text">
    <br>
    <p><span class="desc">User Name: </span><input id="username" type="text">
        <span class="desc">Password: </span><input id="password" type="password"></p>
    <button id="submit" onclick="attemptRegistration()">Create Account</button>
    <p id="success" style="color:white;font-style:25px;visibility:hidden;"></p>
</div>
<div style="color:green;font-style:25px;visibility:hidden;">Account Successfully Created, Redirecting back to log in page..</div>

</body>
</html>