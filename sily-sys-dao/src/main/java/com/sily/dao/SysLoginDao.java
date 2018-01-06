package com.sily.dao;

import com.sily.api.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 8:53 2018/1/4
 * @Modified By:
 **/
@Repository
public interface SysLoginDao {
    /**
     * 查找用户名和密码
     * @param account 登录用户名
     * @return
     */
    SysUser selectByLoginName(String account)throws Exception;

    Integer insertLoginSysUser(SysUser sysUser)throws Exception;

    Integer updateSysUserById(SysUser sysUser);
}
