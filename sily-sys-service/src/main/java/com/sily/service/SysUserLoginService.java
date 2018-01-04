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

    SysUser checkLogin(String account, String password)throws Exception;

    void registerSysUser(SysUser sysUser)throws Exception;
}
