$().ready(function () {
    //获取表格的第一行tr
    var $tableFirstTr = $("#user-list");

    // 从后台获取所有用户
    $.ajax({
        type: "POST",
        contentType: "application/json;charset=utf-8",
        url: "/DataDictionary/AllDataDictionary",
        async: true,
        success: function (Dictionary) {
            var isEnable = "启用";
            var editAble = "读写"
            for (var i = 0;  i < Dictionary.length;i++) {
                //因为多次使用DictionaryID，先建变量
                var DictionaryID = Dictionary[i].id;
                //将Enable的值转变为文字
                if (Dictionary[i].enable == 0) {
                    isEnable = "禁用";
                }
                //将editAble的值转变为文字
                if (Dictionary[i].editAble == 0) {
                    editAble = "只读";
                }
                $tableFirstTr.append("<tr><td>" + Dictionary[i].id + "</td><td>" + Dictionary[i].type + "</td><td>" + Dictionary[i].code + "</td><td>" + Dictionary[i].codeText + "</td><td>" + editAble + "</td><td>1<span class='label label-success'>" + isEnable + "</span></td><td>" + Dictionary[i].createBy + "</td><td>"+Dictionary[i].createTime+"</td><td>"+Dictionary[i].updateBy+"</td><td>"+Dictionary[i].updateTime+"</td> <td>\n" +
                    "                        <a href='singleuser.html?" + DictionaryID + "'>\n" +
                    "                            <button class='btn btn-info btn-block'>查看</button>\n" +
                    "                        </a>\n" +
                    "                    </td>\n" +
                    "                    <td>\n" +
                    "                        <a href='singleuser.html?" + DictionaryID + "'>\n" +
                    "                            <button class='btn btn-warning btn-block'>编辑</button>\n" +
                    "                        </a>\n" +
                    "                    </td>\n" +
                    "                    <td>\n" +
                    "                        <a href='singleuser.html?" + DictionaryID + "'>\n" +
                    "                            <button class='btn btn-danger btn-block'>删除</button>\n" +
                    "                        </a>\n" +
                    "                    </td></tr>");
            }
        },
        error: function (Dictionary) {
            console.log("fail");
        }
    })
});