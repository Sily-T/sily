$().ready(function () {
    $("input[type='radio']:checked").val(1);
    // 获取当前用户id，url问号后面的值
    var userID = location.search.substring(1);
    var jsonUserId = {"id": userID};
    $.ajax({
        type: "POST",
        contentType: "application/json;charset=utf-8",
        url: "/user/singleuser",
        async: true,
        data: JSON.stringify(jsonUserId),
        success: function (result) {
            console.log("success");
            $('#user-name').val(result.account);
            $('#name-pinyin').val(result.namePinyin);
            $('#phone').val(result.phone);
            $('#email').val(result.email);
            $('#id-card').val(result.idCard);
            $('#address').val(result.address);
            $("input[type='radio']:checked").val(result.sex);
            $('#birthday').val(result.birthday);
            $('#dept-id').val(result.deptId);
            $("#select option:selected").val(result.enable);
        },
        error: function (result) {
            console.log("fail");
            alert("XMLHttpRequest.status=" + XMLHttpRequest.status + "\n textStatus=" + textStatus + "\n errorThrown=" + errorThrown);
        }
    })

    $('#save').click(function () {
        if($("input[type='radio']:checked").val() == null){
            var sex = 0;
        }
        var jsonUser = {
            "id": userID,
            "userName": $('#user-name').val(),
            "namePinyin":$('#name-pinyin').val(),
            "phone": $('#phone').val(),
            "email": $('#email').val(),
            "idCard": $('#id-card').val(),
            "address": $('#address').val(),
            "sex": sex,
            "birthday":$('#birthday').val(),
            "deptId":$('#dept-id').val(),
            "enable":$("#select option:selected").val()
        };
        $.ajax({
            type: "POST",
            contentType: "application/json;charset=utf-8",
            url: "/user/updateSingleuser",
            async: true,
            data: JSON.stringify(jsonUser),
            success: function (result) {
                console.log("success222");
            },
            error: function (result) {
                console.log("fail");
                // alert("XMLHttpRequest.status=" + XMLHttpRequest.status + "\n textStatus=" + textStatus + "\n errorThrown=" + errorThrown);
            }
        })
    })
});