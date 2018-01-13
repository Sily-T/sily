package com.sily.api;

public class SysUserRoleVo {
    private SysUserRole sysUserRole;
    private SysRole sysRole;


    /**
     * 为了系统的可扩展性，对原始生成的po进行扩展
     */
    private SysUserRoleVo sysUserRoleVo;

    public SysUserRoleVo() {
    }

    public SysUserRoleVo(SysUserRole sysUserRole, SysRole sysRole, SysUserRoleVo sysUserRoleVo) {
        this.sysUserRole = sysUserRole;
        this.sysRole = sysRole;
        this.sysUserRoleVo = sysUserRoleVo;
    }

    public SysUserRole getSysUserRole() {
        return sysUserRole;
    }

    public void setSysUserRole(SysUserRole sysUserRole) {
        this.sysUserRole = sysUserRole;
    }

    public SysRole getSysRole() {
        return sysRole;
    }

    public void setSysRole(SysRole sysRole) {
        this.sysRole = sysRole;
    }

    public SysUserRoleVo getSysUserRoleVo() {
        return sysUserRoleVo;
    }

    public void setSysUserRoleVo(SysUserRoleVo sysUserRoleVo) {
        this.sysUserRoleVo = sysUserRoleVo;
    }
}
