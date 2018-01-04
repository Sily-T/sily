package com.sily.controller;

import com.sily.api.SysUser;
import com.sily.service.SysUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 10:03 2018/1/4
 * @Modified By:
 **/
@Controller
@RequestMapping("user")
@SessionAttributes("sysUser")
public class SysUserController {

    @Autowired
    private SysUserLoginService sysUserLoginService;

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String checkLogin(SysUser sysUser, Model model) throws Exception {
        sysUser = sysUserLoginService.checkLogin(sysUser.getAccount(),sysUser.getPassword());
        if (sysUser != null){
            model.addAttribute("sysUser",sysUser);
            return "html/index.html";
        }
        return "html/login.html";
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
