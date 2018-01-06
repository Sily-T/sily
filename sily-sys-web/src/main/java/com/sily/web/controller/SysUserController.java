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
    public String userRegister(@RequestBody SysUser sysUser) throws Exception{
            return String.valueOf(sysUserLoginService.registerSysUser(sysUser));
    }

    /**
     * 查询所有用户
     */
    @RequestMapping(value = "/alluser", method = RequestMethod.POST)
    @ResponseBody
    public List<SysUser> selectSysUser() {
        return sysUserLoginService.selectSysUser();
    }

    /**
     * 查询所有用户并分页
     */
    @RequestMapping(value = "/alluserlist", method = RequestMethod.POST)
    @ResponseBody
    public List<SysUser> selectSysUser(@RequestBody int pageNum,int pageSize) {
        return sysUserLoginService.selectSysUserLimit(pageNum,pageSize);
    }

    /**
     * 根据id查询用户
     */
    @RequestMapping(value = "/singleuser", method = RequestMethod.POST)
    @ResponseBody
    public SysUser selectSysUserById(@RequestBody SysUser sysUser) throws Exception {
        return sysUserLoginService.selectSysUserById(sysUser);
    }

    /**
     * 根据id更新用户
     */
    @RequestMapping(value = "/updateSingleuser", method = RequestMethod.POST)
    @ResponseBody
    public Integer updateSysUserById(@RequestBody SysUser sysUser){
        return sysUserLoginService.updateSysUserById(sysUser);
    }
}
