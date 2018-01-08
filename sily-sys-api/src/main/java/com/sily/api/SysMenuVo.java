package com.sily.api;

/**
 * @author
 * @date 2018/1/8
 */
public class SysMenuVo {

    private SysRoleMenu sysRoleMenu;
    private SysMenu sysMenu;


    /**
     * 为了系统的可扩展性，对原始生成的po进行扩展
     */
    private SysMenuVo sysMenuVo;

    public SysMenuVo() {
        super();
    }

    //    public SysMenuVo(Long menuId,String menuName,Long parentId,Long roleId) {
//        System.out.println(menuId);
//        this.sysRoleMenu.setMenuId(menuId);
//        this.sysRoleMenu.setRoleId(roleId);
//        this.sysMenu.setMenuName(menuName);
//        this.sysMenu.setParentId(parentId);
////        this.sysRoleMenu = sysRoleMenu;
////        this.sysMenu = sysMenu;
//    }
    public SysMenuVo(SysMenu sysMenu, SysRoleMenu sysRoleMenu) {
        this.sysRoleMenu = sysRoleMenu;
        this.sysMenu = sysMenu;
    }

    public SysMenuVo(SysRoleMenu sysRoleMenu, SysMenu sysMenu, SysMenuVo sysMenuVo) {
        this.sysRoleMenu = sysRoleMenu;
        this.sysMenu = sysMenu;
        this.sysMenuVo = sysMenuVo;
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

    public SysMenuVo getSysMenuVo() {
        return sysMenuVo;
    }

    public void setSysMenuVo(SysMenuVo sysMenuVo) {
        this.sysMenuVo = sysMenuVo;
    }
}
