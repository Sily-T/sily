$(document).ready(function(){
    $('#btn-register').click(function () {
        var account = $('#account').val();
        var password = $('#password').val();
        var v_password = $('#v-password').val();
        var sysUser = {"account":account, "password":password};

        if (account == null || account == "") {
            alert("用户名不能为空！");
            return;
        }
        if (password == null || password == "") {
            alert("密码不能为空！");
            return;
        }
        if (v_password == null || v_password ==""){
            alert("请再次输入密码！");
            return;
        }
        if (v_password != password){
            alert("两次输入的密码不一致！");
            return;
        }

        console.log(JSON.stringify(sysUser));
        $.ajax({
            type: "POST",
            contentType: "application/json;charset=utf-8",
            url: "/user/register",
            async:false,
            data: JSON.stringify(sysUser),
            success: function (result) {
                console.log("success");
                window.location.href = "/html/login.html";
            },
            error: function (result) {
                console.log("fail");
                alert(result.valueOf());
                alert ("XMLHttpRequest.status="+XMLHttpRequest.status+"\n textStatus="+textStatus+"\n errorThrown=" + errorThrown);
            }
        })
    })

});