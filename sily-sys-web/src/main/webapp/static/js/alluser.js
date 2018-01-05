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
            var userEnable = "启用";
            for (var i = 0; i++; i < result.length) {
                //因为多次使用userid，先建变量
                var userID = result[i].id;
                //将userEnable的值转变为文字
                if (result[i].enable == 0) {
                    userEnable = "禁用";
                }
                userEnable = "启用";
                $tableFirstTr.append("<tr></tr><td>" + result[i].id + "</td><td>" + result[i].account + "</td><td>" + result[i].userType + "</td><td>" + result[i].userName + "</td><td>" + result[i].sex + "</td><td>" + result[i].phone + "</td><td>" + result[i].email + "</td><td>result[i].enable</td> <td>\n" +
                    "                        <a href='singleuser.html?" + userID + "'>\n" +
                    "                            <button class='btn btn-info'>查看</button>\n" +
                    "                        </a>\n" +
                    "                    </td>\n" +
                    "                    <td>\n" +
                    "                        <a href='singleuser.html?" + userID + "'>\n" +
                    "                            <button class='btn btn-warning'>编辑</button>\n" +
                    "                        </a>\n" +
                    "                    </td>\n" +
                    "                    <td>\n" +
                    "                        <a href='singleuser.html?" + userID + "'>\n" +
                    "                            <button class='btn btn-danger'>删除</button>\n" +
                    "                        </a>\n" +
                    "                    </td></tr>");
            }
        },
        error: function (result) {
            console.log("fail");
        }
    })
});