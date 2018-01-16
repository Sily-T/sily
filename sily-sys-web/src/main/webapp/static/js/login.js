$(document).ready(function () {
    $('#btn-login').click(function () {
        var username = $('#username').val();
        var password = $('#password').val();
        var sysUser = {"username": username, "password": password};

        if (username == null || username == "") {
            alert("用户名不能为空！");
            return;
        }
        if (password == null || password == "") {
            alert("密码不能为空！");
            return;
        }
        var header = {
            "typ": "JWT",
            "alg": "HS256"
        }
        var payload = {
            "sub": "1234567890",
            "name": "admin"
        }

        var token = btoa(header) + '.' + btoa(payload);
        // mySecret
        // var signature = HMACSHA256(encodedString, 'secret'); // TJVA95OrM7E2cBab30RMHrHDcEfxjoYZgeFONFh7HgQ
        console.log(JSON.stringify(sysUser));
        $.ajax({
            type: "POST",
            url: "auth",
            async: true,
            contentType: "application/json;charset=utf-8",
            // headers: {
            //     'Authorization': 'Bearer ' + token,
            //     'contentType': "application/json;charset=utf-8"
            // },
            data: JSON.stringify(sysUser),
            success: function (result) {
                console.log("success");
                console.log(result);
                localStorage.setItem("token", result);
                window.location.href = "/react/index.html";
            },
            error: function (result) {
                console.log("fail");
            }
        })
        // $.ajax({
        //     type: "POST",
        //     contentType: "application/json;charset=utf-8",
        //     url: "/user/login",
        //     async:true,
        //     data: JSON.stringify(sysUser),
        //     success: function (result) {
        //         console.log("success");
        //             console.log(result.account);
        //             window.location.href = "/html/index2.html";
        //     },
        //     error: function (result) {
        //         console.log("fail");
        //         alert(result);
        //     }
        // })
    })

    // 更改背景

});

function changeLoginPageBG() {
    // if ($('.wrapper').backgroundImage !=) {
    //     $('.wrapper').backgroundImage(url('../img/loginbg.jpg'));
    // }else if($('.wrapper').backgroundImage !=){
    //     $('.wrapper').backgroundImage(url('../img/loginbg.jpg'));
    // }
}