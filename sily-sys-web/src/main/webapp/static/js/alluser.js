$().ready(function () {
    //获取表格的第一行tr
    var $tableFirstTr = $("#user-list");


    // 从后台获取所有用户
    $.ajax({
        type: "POST",
        contentType: "application/json;charset=utf-8",
        url: "/user/alluser",
        async: true,
        success: function (result) {
            for (var i = 0; i < result.length; i++) {
                $tableFirstTr.append("<tr><td>"+result[i].id+"</td><td>"+result[i].account+"</td><td>"+result[i].userType+"</td><td>"+result[i].userName+"</td><td>"+result[i].sex+"</td><td>"+result[i].phone+"</td><td>"+result[i].email+"</td><td>是否启用</td></tr>");
            }
        },
        error: function (result) {
            console.log("fail");
        }
    })
});