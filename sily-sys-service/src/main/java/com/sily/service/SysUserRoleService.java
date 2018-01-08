package com.sily.service;
import java.util.List;
import com.sily.api.SysUserRole;
public interface SysUserRoleService{
	/**
	 * 获得SysUserRole数据的总行数
	 * @return
	 */
    long getSysUserRoleRowCount();
	/**
	 * 获得SysUserRole数据集合
	 * @return
	 */
    List<SysUserRole> selectSysUserRole();
	/**
	 * 获得一个SysUserRole对象,以参数SysUserRole对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysUserRole selectSysUserRoleByObj(SysUserRole obj);
	/**
	 * 通过SysUserRole的id获得SysUserRole对象
	 * @param id
	 * @return
	 */
    SysUserRole selectSysUserRoleById(Long id);
	/**
	 * 插入SysUserRole到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysUserRole(SysUserRole value);
	/**
	 * 插入SysUserRole中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysUserRole(SysUserRole value);
	/**
	 * 批量插入SysUserRole到数据库
	 * @param value
	 * @return
	 */
    int insertSysUserRoleByBatch(List<SysUserRole> value);
	/**
	 * 通过SysUserRole的id删除SysUserRole
	 * @param id
	 * @return
	 */
    int deleteSysUserRoleById(Long id);
	/**
	 * 通过SysUserRole的id更新SysUserRole中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysUserRoleById(SysUserRole enti);
	/**
	 * 通过SysUserRole的id更新SysUserRole中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysUserRoleById(SysUserRole enti);
}