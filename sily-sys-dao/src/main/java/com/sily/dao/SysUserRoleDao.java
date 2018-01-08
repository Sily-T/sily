package com.sily.dao;
import com.sily.api.SysUserRole;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysUserRoleDao{
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
	 * 批量插入SysUserRole到数据库,包括null值
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

	/**
	 * 根据user_id判断表中该用户是否存在对应角色
	 */
	SysUserRole selectSysUserRoleByUserId(Long userId);

	/**
	 * 根据user_id更新对应的角色role_id
	 */
	int updateSysUserRoleByUserId(Long roleId,Integer enable ,Long id);

    /**
     * 根据页面用户选择的角色，将user_id、role_id、enable插入，createBy和updateBy暂时设置1
     */
	int insertSysUserRoleByUserSelectRole(Integer createBy,Long userId,Long roleId,Integer enable ,Integer updateBy);

}