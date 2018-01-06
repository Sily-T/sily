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
    public Integer registerSysUser(SysUser sysUser)throws Exception {
        Integer integer = sysLoginDao.insertLoginSysUser(sysUser);
        if (integer.equals(1)){
            return integer;
        }
        return 0;
    }

    /**
     * 查询所有用户
     */
    @Override
    public List<SysUser> selectSysUser() {
        List<SysUser> userList = sysUserDao.selectSysUser();
        return userList;
    }

    /**
     * 查询所有用户并分页的数据集合
     */
    @Override
    public List<SysUser> selectSysUserLimit(int pageNum,int pageSize){
        return sysUserDao.selectSysUserLimit(pageNum,pageSize);
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
        return sysUserDao.selectSysUserById(sysUser.getId());
    }

    /**
     * 根据id删除用户
     */
    @Override
    public void deleteSysUserById(SysUser sysUser) throws Exception {
        sysUserDao.deleteSysUserById(sysUser.getId());
    }

    /**
     * 根据id更新用户
     */
    @Override
    public Integer updateSysUserById(SysUser sysUser){
        Integer integer = sysLoginDao.updateSysUserById(sysUser);
        if (integer.equals(1)){
            return integer;
        }
        return 0;
    }
}
