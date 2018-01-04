package com.sily.api;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 9:17 2018/1/4
 * @Modified By:
 **/
public class SysUserVo {

    private SysUser sysUser;
    /**
     * 用户信息
     */

    private SysUserVo sysUserVo;
    /**
     * 为了系统的可扩展性，对原始生成的po进行扩展
     */

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
