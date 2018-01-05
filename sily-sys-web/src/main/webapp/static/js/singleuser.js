$().ready(function () {
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
        },
        error: function (result) {
            console.log("fail");
            alert("XMLHttpRequest.status=" + XMLHttpRequest.status + "\n textStatus=" + textStatus + "\n errorThrown=" + errorThrown);
        }
    })

    $('#save').click(function () {
        var jsonUser = {
            "userName": $('#user-name').val(),
            "namePinyin":$('#name-pinyin').val(),
            "phone": $('#phone').val(),
            "email": $('#email').val(),
            "idCard": $('#id-card').val(),
            "address": $('#address').val(),
            "sex": $("input[type='radio']:checked").val(),
            "birthday":$('#birthday').val(),
            "deptId":$('#dept-id').val(),
        }
        $.ajax({
            type: "POST",
            contentType: "application/json;charset=utf-8",
            url: "/user/singleuser",
            async: true,
            data: JSON.stringify(jsonUser),
            success: function (result) {

            },
            error: function (result) {
                console.log("fail");
                alert("XMLHttpRequest.status=" + XMLHttpRequest.status + "\n textStatus=" + textStatus + "\n errorThrown=" + errorThrown);
            }
        })
    })
});