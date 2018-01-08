$().ready(function () {
    $("input[type='radio']:checked").val(1);
    // 获取当前用户id，url问号后面的值
    var userID = location.search.substring(1);
    var jsonUserId = {"id": userID};
    var userType;
    //请求所有角色信息,此处还未修改
    ajaxAllRole();
    //请求该用户的信息
    ajaxUserInfo(jsonUserId);
    //保存按钮：修改该用户信息
    $('#save').click(function () {
        //获取该用户修改后的值，并组装承json对象
        var jsonUpdateUser=returnUpdateUserInfoJson(userID);
        //向后端请求修改用户的信息
        $.ajax({
            type: "POST",
            contentType: "application/json;charset=utf-8",
            url: "/user/updateSingleuser",
            async: true,
            data: JSON.stringify(jsonUpdateUser),
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

//请求所有角色信息
function ajaxAllRole() {
    $.ajax({
        type: "POST",
        contentType: "application/json;charset=utf-8",
        url: "/role/allrolelist",
        async: false,
        success: function (allRole) {
            //生成所有角色dom节点
            for (var i = 0; i < allRole.length; i++) {
                // $('#ol-roles').append("<li>\n" +
                //     "                                <div class='checkbox'>\n" +
                //     "                                    <label>\n" +
                //     "                                        <input id='"+allRole[i].id+"' type='checkbox'> "+allRole[i].roleName+"\n" +
                //     "                                    </label>\n" +
                //     "                                </div>\n" +
                //     "                            </li>");

                $('#ol-roles').append("         <li>\n" +
                    "                                <label class='checkbox-inline'>\n" +
                    "                                    <input type='radio' id='"+allRole[i].id+"' name='role-options' >"+allRole[i].roleName+"\n" +
                    "                                </label>\n" +
                    "                            </li>");
            }
        },
        error: function (allRole) {
            console.log("ajaxAllRole fail");
        }
    })
}

//请求该用户的信息
function ajaxUserInfo(jsonUserId) {
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
        }
    });
}
//获取该用户修改后的值，并组装承json对象
function returnUpdateUserInfoJson (userID) {
    if ($("input[type='radio']:checked").val() == null) {
        var sex = 0;
    }
    var jsonUser = {
        "id": userID,
        "userName": $('#user-name').val(),
        "namePinyin": $('#name-pinyin').val(),
        "phone": $('#phone').val(),
        "email": $('#email').val(),
        "idCard": $('#id-card').val(),
        "address": $('#address').val(),
        "sex": sex,
        "birthday": $('#birthday').val(),
        "deptId": $('#dept-id').val(),
        "enable": $("#select option:selected").val(),
        "userType":$('.checkbox~:checkbox:checked').attr('id')
    };
    return jsonUser
}
