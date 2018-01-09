var zTreeObj;

var setting = {
    check: {
        enable: true,       //设置是否显示checkbox复选框
        chkStyle: "checkbox",
        chkboxType: {"Y": "ps", "N": "ps"} //父子关联关系
    },
    view: {
        showLine: true,  //显示连线
        selectedMulti: true,
    },//允许选多个,按下 Ctrl 或 Cmd 键可以选中多个节点
    data: {
        simpleData: {
            enable: true, //没有开启简单形式，就是通过数组形式传输
            idKey: "id",
            pIdKey: "pId",
            rootPId: null
        }
    }
};
// zTreeNode 节点数据详解 ，
var zNodes = [
    // {name:"用户", open:true, children:[
    //         {name:"查询用户" }, {name:"修改用户"},{name:"增加用户"}, {name:"删除用户"}]},
    //
    // {name:"用户","id":"1","pId":null},{name:"查询用户","id":"11","pId":"1" }, {name:"修改用户","id":"12","pId":"1"},{name:"增加用户","id":"13","pId":"1"}, {name:"删除用户","id":14,"pId":"1"}

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
                $('#role-select').append("<option id='" + roleList[i].id + "' onclick='ajaxGetRoleMenu(" + roleList[i].id + ")'>" + roleList[i].roleName + "</option>");
            }
        },
        error: function (roleList) {
            console.log("fail");
        }
    });


});

//根据点击角色，显示角色的菜单权限
function ajaxGetRoleMenu(roleId) {
    var assembleMenuJson=[];
    //删除提示信息
    $("#cust_tip").remove();
    //删除菜单节点，防止重复点击生成多余节点。
    var treeObj=$.fn.zTree.getZTreeObj("treeDemo");
    var nodes = treeObj.getNodes();
    //此处报错Uncaught TypeError: a.getParentNode is not a function，暂未解决
    if (nodes && nodes.length>0) {
        treeObj.removeNode(nodes);
    }

    // 转换为json对象
    var jsonRoleId = {"id": roleId};
    // 请求角色菜单权限
    $.ajax({
        type: "POST",
        contentType: "application/json;charset=utf-8",
        url: "/SysMenuController/getMenu",
        async: true,
        data: JSON.stringify(jsonRoleId),
        success: function (menuHashMap) {
            console.log("success");
            console.log(menuHashMap.sysMenuVoList[1].sysMenu.id);
            console.log(menuHashMap.sysMenuVoList[1].sysMenu.parentId);
            //此处生成树形结构，为treeObj添加新的节点，返回的result要转换成类似这种形式
            //2018年1月8日，此处还需要修改的，因为性能受到影响，初步想法是，先在后台组装json,前台jsGC差
            //2018年1月9日测试，此处的json已经做过最后逗号的处理，应该暂不影响输出

            //此处是获取菜单列表
            for (var i = 0; i < menuHashMap.sysMenuVoList.length; i++) {
               var jsonObj = {name:  menuHashMap.sysMenuVoList[i].sysMenu.menuName ,"id":  menuHashMap.sysMenuVoList[i].sysMenu.id ,"pId": menuHashMap.sysMenuVoList[i].sysMenu.parentId ,checked:true };
                assembleMenuJson.push(jsonObj);
            }
            console.log("sysRoleMenu.permission:"+menuHashMap.sysRoleMenuList.length);
            console.log("sysRoleMenu.permission:"+menuHashMap.sysRoleMenuList[1].permission);
            //此处是获取菜单的权限信息,此处的id是ztree自动生成的
            for (var i = 0; i < menuHashMap.sysRoleMenuList.length; i++) {
                var jsonObj = {name:  menuHashMap.sysRoleMenuList[i].permission ,"pId": menuHashMap.sysRoleMenuList[i].menuId,checked:true };
                assembleMenuJson.push(jsonObj);
            }
            console.log("assembleMenuJson:"+JSON.stringify(assembleMenuJson));

            //此处选择整一个tree对象，getZTreeObj是通过id查询，参数并非选择器类型
            $.fn.zTree.getZTreeObj("treeDemo").addNodes(null,assembleMenuJson);

        },
        error: function (menuHashMap) {
            //此处应该显示404html，或者尝试刷新界面
        }
    })
}