package com.sily.web.controller;

import com.sily.api.SysUser;
import com.sily.service.SysUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public SysUser checkLogin(@RequestBody SysUser sysUser) throws Exception {
        return sysUserLoginService.checkLogin(sysUser);
    }

    /**
     * 用户注册
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String userRegister(@RequestBody SysUser sysUser) {
        try {
            System.out.println(sysUserLoginService.registerSysUser(sysUser));
            return String.valueOf(sysUserLoginService.registerSysUser(sysUser));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
        return "1";
    }

    /**
     * 查询所有用户
     */
    @RequestMapping(value = "/alluser", method = RequestMethod.POST)
    @ResponseBody
    public List<SysUser> selectSysUser() throws Exception {
        return sysUserLoginService.selectSysUser();
    }
}
