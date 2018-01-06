package com.sily.web.controller;

import com.sily.api.SysRole;
import com.sily.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 14:20 2018/1/6
 * @Modified By:
 **/
@Controller
@RequestMapping("/role")
public class SysRoleController {

    @Autowired
    SysRoleService sysRoleService;

    /**
     * 查询出所有的角色
     */
    @RequestMapping(value = "/allrolelist", method = RequestMethod.POST)
    @ResponseBody
    public List<SysRole> selectSysRole(){
        return sysRoleService.selectSysRole();
    }

}
