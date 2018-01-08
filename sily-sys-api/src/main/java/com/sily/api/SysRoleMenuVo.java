package com.sily.api;

/**
 * @author Lime
 * @date 2018/1/8
 */
public class SysRoleMenuVo {

    private SysRoleMenu sysRoleMenu;
    private SysMenu sysMenu;


    /**
     * 为了系统的可扩展性，对原始生成的po进行扩展
     */
    private SysRoleMenuVo sysRoleMenuVo;

    public SysRoleMenuVo(SysRoleMenu sysRoleMenu, SysMenu sysMenu, SysRoleMenuVo sysRoleMenuVo) {
        this.sysRoleMenu = sysRoleMenu;
        this.sysMenu = sysMenu;
        this.sysRoleMenuVo = sysRoleMenuVo;
    }

    public SysRoleMenu getSysRoleMenu() {
        return sysRoleMenu;
    }

    public void setSysRoleMenu(SysRoleMenu sysRoleMenu) {
        this.sysRoleMenu = sysRoleMenu;
    }

    public SysMenu getSysMenu() {
        return sysMenu;
    }

    public void setSysMenu(SysMenu sysMenu) {
        this.sysMenu = sysMenu;
    }

    public SysRoleMenuVo getSysRoleMenuVo() {
        return sysRoleMenuVo;
    }

    public void setSysRoleMenuVo(SysRoleMenuVo sysRoleMenuVo) {
        this.sysRoleMenuVo = sysRoleMenuVo;
    }
}
