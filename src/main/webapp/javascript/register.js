

function registerUser() {
    var firstName = $("#firstName").val().trim();
    var lastName = $("#lastName").val().trim();
    var userName = $("#userName").val().trim();
    var uPassword = $("#uPassword").val().trim();



    var user = {
        "fName" : firstName,
        "lName" : lastName,
        "uName" : userName,
        "uPassword" : uPassword
    }

    $.ajax({
        type: "POST",
        contentType : 'application/json; charset=utf-8',
        dataType : 'json',
        url: "/register/newUser",
        data: JSON.stringify(user), // Note it is important
        success :function(result) {
            document.location.href = 'C:\\Users\\John Long\\eclipse-workspace\\EZHotel\\src\\main\\webapp\\WEB-INF\\view\\home.html';
        }
    });
}
