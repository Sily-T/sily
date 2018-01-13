package com.sily.dao;

import com.sily.api.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysRoleDao {


    /**
     * 获得SysRole数据的总行数
     *
     * @return
     */
    long getSysRoleRowCount();

    /**
     * 获得SysRole数据集合
     *
     * @return
     */
    List<SysRole> selectSysRole();

    /**
     * 获得一个SysRole对象,以参数SysRole对象中不为空的属性作为条件进行查询
     *
     * @param obj
     * @return
     */
    SysRole selectSysRoleByObj(SysRole obj);

    /**
     * 通过SysRole的id获得SysRole对象
     *
     * @param id
     * @return
     */
    SysRole selectSysRoleById(Long id);

    /**
     * 插入SysRole到数据库,包括null值
     *
     * @param value
     * @return
     */
    int insertSysRole(SysRole value);

    /**
     * 插入SysRole中属性值不为null的数据到数据库
     *
     * @param value
     * @return
     */
    int insertNonEmptySysRole(SysRole value);

    /**
     * 批量插入SysRole到数据库,包括null值
     *
     * @param value
     * @return
     */
    int insertSysRoleByBatch(List<SysRole> value);

    /**
     * 通过SysRole的id删除SysRole
     *
     * @param id
     * @return
     */
    int deleteSysRoleById(Long id);

    /**
     * 通过SysRole的id更新SysRole中的数据,包括null值
     *
     * @param enti
     * @return
     */
    int updateSysRoleById(SysRole enti);

    /**
     * 通过SysRole的id更新SysRole中属性不为null的数据
     *
     * @param enti
     * @return
     */
    int updateNonEmptySysRoleById(SysRole enti);
}