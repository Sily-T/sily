package com.sily.service.Impl;

import com.sily.api.SysUser;
import com.sily.dao.SysLoginDao;
import com.sily.dao.SysUserDao;
import com.sily.service.SysUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public SysUser checkLogin(String account, String password) throws Exception {
        SysUser sysUser = sysLoginDao.selectByLoginName(account);
        if (sysUser != null && sysUser.getPassword().equals(password)){
            return sysUser;
        }
        return null;
    }

    @Override
    public void registerSysUser(SysUser sysUser) throws Exception {
        sysUserDao.insertSysUser(sysUser);
    }
}
