var firstName;
var surname;
var email;
var username;
var password;
var auth;

$(document).ready(function(){
    var url = new URL(window.location.href);
    auth =  url.searchParams.get("auth");
    if (auth === null){
        document.location.href = '../pages/home.html';
    }
    getActivationStatus(function(response){
        if (response !== "0"){
            document.location.href = '../pages/home.html';
        }
    });
});

function createAccount(){
    getActivationStatus(function(response){
        if (response === "0"){
            $.post({
                url: "/frontend/SignInRegistrationServlet",
                cache: false,
                type : "POST",
                data : {firstName : firstName,surname: surname, email: email, username: username, password: password, auth: auth}
            },function(result){
                if (result !== "failure"){
                    $("#success").text("Account Created! Navigating back to the Home Page.");
                    $("#success").css("visibility","visible");
                    setTimeout(function(){
                        document.location.href = '/frontend/pages/index.html';
                    },4000);
                }
            });
        }
    });
}
