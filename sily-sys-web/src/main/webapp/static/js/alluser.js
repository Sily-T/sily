$().ready(function () {
    //获取表格的第一行tr
    var $tableFirstTr = $("#user-list");
    // 从后台获取所有用户
    doAjax($tableFirstTr);
    // 从后台获取所有用户
    // $.ajax({
    //     type: "POST",
    //     contentType: "application/json;charset=utf-8",
    //     url: "/user/alluser",
    //     async: true,
    //     success: function (result) {
    //         var userEnable = "启用";
    //         for (var i = 0;  i < result.length;i++) {
    //             console.log("come in1");
    //             //因为多次使用userid，先建变量
    //             var userID = result[i].id;
    //             //将userEnable的值转变为文字
    //             if (result[i].enable == 0) {
    //                 userEnable = "禁用";
    //             }
    //             console.log("come in");
    //             userEnable = "启用";
    //             $tableFirstTr.append("<tr></tr><td>" + result[i].id + "</td><td>" + result[i].account + "</td><td>" + result[i].userType + "</td><td>" + result[i].userName + "</td><td>" + result[i].sex + "</td><td>" + result[i].phone + "</td><td>" + result[i].email + "</td><td>"+userEnable+"</td> <td>\n" +
    //                 "                        <a href='singleuser.html?" + userID + "'>\n" +
    //                 "                            <button class='btn btn-info btn-block'>查看</button>\n" +
    //                 "                        </a>\n" +
    //                 "                    </td>\n" +
    //                 "                    <td>\n" +
    //                 "                        <a href='singleuser.html?" + userID + "'>\n" +
    //                 "                            <button class='btn btn-warning btn-block'>编辑</button>\n" +
    //                 "                        </a>\n" +
    //                 "                    </td>\n" +
    //                 "                    <td>\n" +
    //                 "                        <a href='singleuser.html?" + userID + "'>\n" +
    //                 "                            <button class='btn btn-danger btn-block'>删除</button>\n" +
    //                 "                        </a>\n" +
    //                 "                    </td></tr>");
    //         }
    //     },
    //     error: function (result) {
    //         console.log("fail");
    //     }
    // })
});
// 从后台获取所有用户
async function doAjax($tableFirstTr) {
    let result;
    try {
        result = await $.ajax({
            type: "POST",
            contentType: "application/json;charset=utf-8",
            url: "/user/alluser"
        });
        var userEnable = "启用";
        for (var i = 0; i < result.length; i++) {
            console.log("come in1");
            //因为多次使用userid，先建变量
            var userID = result[i].id;
            //将userEnable的值转变为文字
            if (result[i].enable == 0) {
                userEnable = "禁用";
            }
            console.log("come in");
            userEnable = "启用";
            $tableFirstTr.append("<tr></tr><td>" + result[i].id + "</td><td>" + result[i].account + "</td><td>" + result[i].userType + "</td><td>" + result[i].userName + "</td><td>" + result[i].sex + "</td><td>" + result[i].phone + "</td><td>" + result[i].email + "</td><td>" + userEnable + "</td> <td>\n" +
                "                        <a href='singleuser.html?" + userID + "'>\n" +
                "                            <button class='btn btn-info btn-block'>查看</button>\n" +
                "                        </a>\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                        <a href='singleuser.html?" + userID + "'>\n" +
                "                            <button class='btn btn-warning btn-block'>编辑</button>\n" +
                "                        </a>\n" +
                "                    </td>\n" +
                "                    <td>\n" +
                "                        <a href='singleuser.html?" + userID + "'>\n" +
                "                            <button class='btn btn-danger btn-block'>删除</button>\n" +
                "                        </a>\n" +
                "                    </td></tr>");
        }
    } catch (error) {
        console.error(error);
    }
}

