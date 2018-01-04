package com.sily.web.controller;

import com.sily.api.SysUser;
import com.sily.service.SysUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 10:03 2018/1/4
 * @Modified By:
 **/
@Controller
@RequestMapping("/user")
@SessionAttributes("sysUser")
public class SysUserController {

    @Autowired
    private SysUserLoginService sysUserLoginService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test() throws Exception {
        System.out.println("test");
    }
    /**
     * 用户登录
     */

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public SysUser checkLogin(@RequestBody SysUser sysUser) throws Exception {
        /*sysUser = sysUserLoginService.checkLogin(sysUser.getAccount(),sysUser.getPassword());*/
        System.out.println("success");
        sysUser = sysUserLoginService.checkLogin("admin","admin");
        System.out.println(sysUser.getAccount());
            return sysUser;
    }

    /**
     * 用户注册
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String userRegister(SysUser sysUser,Model model)throws Exception{
        sysUserLoginService.registerSysUser(sysUser);
        return "html/login.html";
    }
}
