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
        console.log(JSON.stringify(sysUser));
        $.ajax({
            type: "POST",
            contentType: "application/json;charset=utf-8",
            url: "auth",
            async:true,
            data: JSON.stringify(sysUser),
            success: function (result) {
                console.log("success");
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
        //             window.location.href = "/html/index.html";
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