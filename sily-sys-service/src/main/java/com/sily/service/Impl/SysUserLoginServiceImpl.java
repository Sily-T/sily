package com.sily.service.Impl;

import com.sily.api.SysUser;
import com.sily.dao.SysLoginDao;
import com.sily.dao.SysUserDao;
import com.sily.service.SysUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 9:50 2018/1/4
 * @Modified By:
 **/
@Service
public class SysUserLoginServiceImpl implements SysUserLoginService{

    @Autowired
    private SysLoginDao sysLoginDao;
    @Autowired
    private SysUserDao sysUserDao;

    /**
     * 用户登录
     */
    @Override
    public SysUser checkLogin(SysUser sysUser) throws Exception {
        SysUser sysLoginUser = sysLoginDao.selectByLoginName(sysUser.getAccount());
        if (sysLoginUser != null && sysLoginUser.getPassword().equals(sysUser.getPassword())){
            return sysLoginUser;
        }
        return null;
    }

    /**
     * 用户注册
     */
    @Override
    public Integer registerSysUser(SysUser sysUser) {
        Integer integer = sysLoginDao.insertLoginSysUser(sysUser.getAccount(),sysUser.getPassword());
        if (integer.equals(1)){
            return integer;
        }
        return 0;
    }

    @Override
    public List<SysUser> selectSysUser() throws Exception {
        List<SysUser> list = sysUserDao.selectSysUser();
        return list;
    }

    /**
     * 新增用户
     */
    @Override
    public Integer insertSysUser(SysUser sysUser) throws Exception {
        return null;
    }

    /**
     * 根据id查询用户
     */
    @Override
    public SysUser selectSysUserById(SysUser sysUser) throws Exception {
        return null;
    }

    /**
     * 根据id删除用户
     */
    @Override
    public Integer deleteSysUserById(SysUser sysUser) throws Exception {
        return null;
    }

    /**
     * 根据id修改用户
     */
    @Override
    public Integer updateSysUserById(SysUser sysUser) throws Exception {
        return null;
    }
}
