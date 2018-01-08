var zTreeObj;

var setting = {
    check:{
        enable: true  ,       //设置是否显示checkbox复选框
        chkStyle: "checkbox",
        chkboxType : { "Y" : "ps", "N" : "ps" } //父子关联关系
    },
    view: {
        showLine: true,  //显示连线
        selectedMulti: true, },//允许选多个,按下 Ctrl 或 Cmd 键可以选中多个节点
    data: {
        simpleData: {
            enable : true, //没有开启简单形式，就是通过数组形式传输
            idKey : "id",
            pIdKey : "pId",
            rootPId : null
        }
    }
};
// zTreeNode 节点数据详解 ，
var zNodes = [
    // {name:"用户", open:true, children:[
    //         {name:"查询用户" }, {name:"修改用户"},{name:"增加用户"}, {name:"删除用户"}]},
    //
    // {name:"用户","id":"t1","pId":null},{name:"查询用户","id":"t11","pId":"t1" }, {name:"修改用户","id":"t12","pId":"t1"},{name:"增加用户","id":"t13","pId":"t1"}, {name:"删除用户","id":14,"pId":"t1"}

];
$().ready(function () {
    zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, zNodes);


    //请求所有角色信息，ajax需要是同步，async要设置为false
    $.ajax({
        type: "POST",
        contentType: "application/json;charset=utf-8",
        url: "/role/allrolelist",
        async: false,
        data: JSON.stringify(),
        success: function (roleList) {
            console.log("success");
            for (var i = 0; i < roleList.length; i++) {
                //2018年1月7日早上修改
                $('#role-select').append("<option id='"+roleList[i].id+"' onclick='ajaxGetRoleMenu("+roleList[i].id+")'>"+roleList[i].roleName+"</option>");
            }
        },
        error: function (roleList) {
            console.log("fail");
        }
    });


});

//根据点击角色，显示角色的菜单权限
function ajaxGetRoleMenu(roleId) {
    // 转换为json对象
    var jsonRoleId={"id":roleId};
    // 请求角色菜单权限
    $.ajax({
        type: "POST",
        contentType: "application/json;charset=utf-8",
        url: "/SysMenuController/getMenu",
        async: true,
        data: JSON.stringify(jsonRoleId),
        success: function (menuList) {
            console.log("success");
            console.log(menuList[1].sysMenu.menuName);
            //此处生成树形结构，为treeObj添加新的节点，返回的result要转换成类似这种形式
            //此处还需要修改的，因为性能受到影响，初步想法是，先在后台组装json
            for (var i=0;i<menuList.length;i++){
                var exNodes = [
                    {name:menuList[i].sysMenu.menuName,"id":menuList[i].sysRoleMenu.id,"pId":menuList[i].sysMenu.parentId}
                ];
            //此处选择整一个tree对象，getZTreeObj是通过id查询，参数并非选择器类型
                $.fn.zTree.getZTreeObj("treeDemo").addNodes(null, exNodes);
            }
        },
        error: function (menuList) {
            //此处应该显示404html，或者尝试刷新界面
        }
    })
}