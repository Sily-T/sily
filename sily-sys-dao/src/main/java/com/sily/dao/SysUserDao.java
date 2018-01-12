package com.sily.dao;

import com.sily.api.SysUser;
import com.sily.api.SysUserCustom;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserDao {

    /**
     * 根据用户账号查找用户，目前用于token功能的需要
     *
     * @param account 用户账号
     * @return com.sily.api.SysUser
     * Date: 2018/1/12
     */
    SysUser selectSysUserByAccount(String account);

    /**
     * 获得SysUser数据的总行数
     *
     * @return
     */
    long getSysUserRowCount();

    /**
     * 获得SysUser数据集合
     *
     * @return
     */
    List<SysUser> selectSysUser();

    /**
     * 获得一个SysUser对象,以参数SysUser对象中不为空的属性作为条件进行查询
     *
     * @param obj
     * @return
     */
    SysUser selectSysUserByObj(SysUser obj);

    /**
     * 通过SysUser的id获得SysUser对象
     *
     * @param id
     * @return
     */
    SysUser selectSysUserById(Long id);

    /**
     * 插入SysUser到数据库,包括null值
     *
     * @param value
     * @return
     */
    int insertSysUser(SysUser value);

    /**
     * 插入SysUser中属性值不为null的数据到数据库
     *
     * @param value
     * @return
     */
    int insertNonEmptySysUser(SysUser value);

    /**
     * 批量插入SysUser到数据库,包括null值
     *
     * @param value
     * @return
     */
    int insertSysUserByBatch(List<SysUser> value);

    /**
     * 通过SysUser的id删除SysUser
     *
     * @param id
     * @return
     */
    int deleteSysUserById(Long id);

    /**
     * 通过SysUser的id更新SysUser中的数据,包括null值
     *
     * @param sysUserCustom
     * @return
     */
    int updateSysUserById(SysUserCustom sysUserCustom);

    /**
     * 通过SysUser的id更新SysUser中属性不为null的数据
     *
     * @param enti
     * @return
     */
    int updateNonEmptySysUserById(SysUser enti);

    /**
     * 获得SysUser分页的数据集合
     *
     * @return
     */
    List<SysUser> selectSysUserLimit(int pageNum, int pageSize);
}