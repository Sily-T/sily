var zTreeObj;
// zTree 的参数配置，深入使用请参考 API 文档（setting 配置详解）
var setting = {
    check:{
        enable: true         //设置是否显示checkbox复选框
    }
};
// zTree 的数据属性，深入使用请参考 API 文档（zTreeNode 节点数据详解）
var zNodes = [
    {name:"用户", open:true, children:[
            {name:"查询用户"}, {name:"修改用户"},{name:"增加用户"}, {name:"删除用户"}]},
    {name:"部门", open:true, children:[
            {name:"查询部门"}, {name:"修改部门"}, {name:"增加部门"}, {name:"删除部门"}]}
];
$().ready(function () {

    zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, zNodes);

    //请求所有角色信息，ajax需要是同步，async要设置为false
    $.ajax({
        type: "POST",
        contentType: "application/json;charset=utf-8",
        url: "",
        async: false,
        data: JSON.stringify(),
        success: function (result) {
            console.log("success");
            for (var i = 0; i < result.length; i++) {
                // $('#role-select').append("<option>"+result.+"</option>");
            }
        },
        error: function (result) {
            console.log("fail");
        }
    });


    //根据点击角色，显示角色的权限

    $.ajax({
        type: "POST",
        contentType: "application/json;charset=utf-8",
        url: "",
        async: true,
        data: JSON.stringify(),
        success: function (result) {
            console.log("success");
        //此处生成树形结构

        },
        error: function (result) {
            //此处应该显示404html，或者尝试刷新界面
        }
    })
});