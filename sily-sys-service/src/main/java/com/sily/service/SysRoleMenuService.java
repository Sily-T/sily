package com.sily.service;

import com.sily.api.SysRole;
import com.sily.api.SysRoleMenu;

import java.util.List;

/**
 * @author
 * @date 2018/1/9
 */
public interface SysRoleMenuService {

    /**
     * 通过角色的ID获取菜单的CRUD权限
     *
     * @param sysRole 角色实体类，目前仅需要id
     * @return java.util.List<com.sily.api.SysRoleMenu>
     * Date: 2018/1/9
     */
    List<SysRoleMenu> getMenuPermissionByRoleId(SysRole sysRole);
}



