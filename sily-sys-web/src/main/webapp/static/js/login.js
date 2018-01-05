$(document).ready(function(){
    $('#btn-login').click( function login() {
        var account = $('#account').val();
        var password = $('#password').val();
        var sysUser = {"account":account, "password":password};

        if (account == null || account == "") {
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
            url: "/user/login",
            async:false,
            data: JSON.stringify(sysUser),
            success: function (result) {
                    console.log(result);
                    window.location.href = "/html/index.html";
            },
            error: function (result) {
                alert(result);
            }
        })
    })
});