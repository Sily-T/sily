$().ready(function () {
    //获取表格的第一行tr
    var $tableFirstTr = $("#user-list");


    // 从后台获取所有用户
    $.ajax({
        type: "POST",
        contentType: "application/json;charset=utf-8",
        url: "",
        async: true,
        data: JSON.stringify(),
        success: function (result) {
            for (var i=0;i++;i<result.length) {
                $tableFirstTr.append("<td>序号</td><td>账户</td><td>账户类型</td><td>姓名</td><td>性别</td><td>手机</td><td>邮箱</td><td>是否启用</td>");
            }
        },
        error: function (result) {
            console.log("fail");
        }
    })