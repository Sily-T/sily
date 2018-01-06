package com.sily.api;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 9:17 2018/1/4
 * @Modified By:
 **/
public class SysUserVo {

    /**
     * 用户信息
     */
    private SysUser sysUser;

    /**
     * 为了系统的可扩展性，对原始生成的po进行扩展
     */
    private SysUserVo sysUserVo;

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public SysUserVo getSysUserVo() {
        return sysUserVo;
    }

    public void setSysUserVo(SysUserVo sysUserVo) {
        this.sysUserVo = sysUserVo;
    }
}
