package com.sily.web.controller;

import com.sily.api.SysMenuVo;
import com.sily.api.SysRole;
import com.sily.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(method = RequestMethod.POST, value = "/getMenu")
    @ResponseBody
    public List<SysMenuVo> getMenuByRoleId(@RequestBody SysRole sysRole) {
        System.out.println(sysRole.getId());
        return sysMenuService.getMenuByRoleId(sysRole);
    }
}
