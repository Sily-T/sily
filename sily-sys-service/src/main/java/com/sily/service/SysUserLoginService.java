package com.sily.service;

import com.sily.api.SysUser;

import java.util.List;

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

    /**
     * 查询所有用户
     */
    List<SysUser> selectSysUser()throws Exception;

    /**
     * 新增用户
     */
    Integer insertSysUser(SysUser sysUser)throws Exception;

    /**
     * 根据id查询用户
     */
    SysUser selectSysUserById(SysUser sysUser)throws Exception;

    /**
     * 根据id删除用户
     */
    Integer deleteSysUserById(SysUser sysUser)throws Exception;

    /**
     * 根据id修改用户
     */
    Integer updateSysUserById(SysUser sysUser)throws Exception;
}
