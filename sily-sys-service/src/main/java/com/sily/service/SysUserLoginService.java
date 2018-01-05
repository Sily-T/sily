package com.sily.service;

import com.sily.api.SysUser;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 9:49 2018/1/4
 * @Modified By:
 **/
public interface SysUserLoginService {

    /**
     * 用户登录
     */
    SysUser checkLogin(SysUser sysUser)throws Exception;

    /**
     * 用户注册
     */
    Integer registerSysUser(SysUser sysUser)throws Exception;
}
