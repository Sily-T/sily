package com.sily.dao;

import com.sily.api.SysRole;
import com.sily.api.SysRoleMenu;

import java.util.HashMap;
import java.util.List;

public interface SysRoleMenuDao {

    /**
     * 通过角色的ID获取菜单的CRUD权限
     */
    List<SysRoleMenu> getMenuPermissionByRoleId(Long roleId);

    /**
     * 获得SysRoleMenu数据的总行数
     *
     * @return
     */
    long getSysRoleMenuRowCount();

    /**
     * 获得SysRoleMenu数据集合
     *
     * @return
     */
    List<SysRoleMenu> selectSysRoleMenu();

    /**
     * 获得一个SysRoleMenu对象,以参数SysRoleMenu对象中不为空的属性作为条件进行查询
     *
     * @param obj
     * @return
     */
    SysRoleMenu selectSysRoleMenuByObj(SysRoleMenu obj);

    /**
     * 通过SysRoleMenu的id获得SysRoleMenu对象
     *
     * @param id
     * @return
     */
    SysRoleMenu selectSysRoleMenuById(Long id);

    /**
     * 插入SysRoleMenu到数据库,包括null值
     *
     * @param value
     * @return
     */
    int insertSysRoleMenu(SysRoleMenu value);

    /**
     * 插入SysRoleMenu中属性值不为null的数据到数据库
     *
     * @param value
     * @return
     */
    int insertNonEmptySysRoleMenu(SysRoleMenu value);

    /**
     * 批量插入SysRoleMenu到数据库,包括null值
     *
     * @param value
     * @return
     */
    int insertSysRoleMenuByBatch(List<SysRoleMenu> value);

    /**
     * 通过SysRoleMenu的id删除SysRoleMenu
     *
     * @param id
     * @return
     */
    int deleteSysRoleMenuById(Long id);

    /**
     * 通过SysRoleMenu的id更新SysRoleMenu中的数据,包括null值
     *
     * @param enti
     * @return
     */
    int updateSysRoleMenuById(SysRoleMenu enti);

    /**
     * 通过SysRoleMenu的id更新SysRoleMenu中属性不为null的数据
     *
     * @param enti
     * @return
     */
    int updateNonEmptySysRoleMenuById(SysRoleMenu enti);
}