package com.sily.web.controller;

import com.sily.api.SysMenuVo;
import com.sily.api.SysRole;
import com.sily.api.SysRoleMenu;
import com.sily.service.SysMenuService;
import com.sily.service.SysRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @date 2018/1/8
 */
@Controller
@RequestMapping("/SysMenuController")
public class SysMenuController {
    @Autowired
    SysMenuService sysMenuService;
    @Autowired
    SysRoleMenuService sysRoleMenuService;

    /**
     * 通过角色的ID获取菜单的CRUD权限，2018年1月9日修改
     *
     * @param sysRole 角色实体类，目前里面仅有id
     * @return java.util.List<com.sily.api.SysMenuVo>
     * Date: 2018/1/9
     */
    @RequestMapping(method = RequestMethod.POST, value = "/getMenu")
    @ResponseBody
    public HashMap<String, List> getMenuByRoleId(@RequestBody SysRole sysRole) {

        HashMap<String, List> menuHashMap = new HashMap<>(16);
//        取出菜单
        List<SysMenuVo> sysMenuVoList = sysMenuService.getMenuByRoleId(sysRole);
//        取出相应权限
        List<SysRoleMenu> sysRoleMenuList = sysRoleMenuService.getMenuPermissionByRoleId(sysRole);
        menuHashMap.put("sysMenuVoList", sysMenuVoList);
        menuHashMap.put("sysRoleMenuList", sysRoleMenuList);

        return menuHashMap;
    }
}
