$(document).ready(function(){
    console.log("sdf");
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
        console.log("come in");
        $.ajax({
            type: "POST",
            contentType: 'application/json;charset=utf-8',
            async: false,
            url: "${pageContext.request.contextPath}/sily/user/login.action",
            data: JSON.stringify(sysUser),
            success: function (result) {
                    window.location.href = "index.html";
            },
            error: function () {
                alert("异常！");
            }
        })
    })
});