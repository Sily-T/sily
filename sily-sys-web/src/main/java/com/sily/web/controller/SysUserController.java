package com.sily.web.controller;

import com.sily.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @date 2018/1/3
 */
@Controller
@RequestMapping("/SysUserController")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;


}
