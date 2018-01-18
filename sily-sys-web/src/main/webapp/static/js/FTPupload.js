$().ready(function () {

    //提交上传文件
    $('#submit').click(function () {
        var ftpHost = $('#ip-address').val();
        var ftpUser= $('#user-name').val();
        var ftpPassword = $('#password').val();
        var ftpPath = $('#cust-file').val();
        var kmConfig = {"ftpHost":ftpHost, "ftpUser":ftpUser, "ftpPassword":ftpPassword, "ftpPath":ftpPath};

        $.ajax({
            type:"POST",
            url:"",
            async:true,
            contentType:"application/json;charset=utf-8",
            data:JSON.stringify(kmConfig),
            success:function(){
                console.log("success");
            },
            error: function (result) {
                console.log("fail");
            }
        })

    });

});