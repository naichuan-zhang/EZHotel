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
        document.location.href = '../pages/login.html';
    }
    getActivationStatus(function(response){
        if (response !== "0"){
            document.location.href = '/frontend/pages/login.html';
        }
    });
});
