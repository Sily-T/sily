package com.sily.service.Impl;
import java.util.List;
import com.sily.dao.SysUserDao;
import com.sily.api.SysUser;
import com.sily.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SysUserServiceImpl implements SysUserService{
    @Autowired
    private SysUserDao sysUserDao;
    @Override
    public long getSysUserRowCount(){
        return sysUserDao.getSysUserRowCount();
    }
    @Override
    public List<SysUser> selectSysUser(){
        return sysUserDao.selectSysUser();
    }
    @Override
    public SysUser selectSysUserByObj(SysUser obj){
        return sysUserDao.selectSysUserByObj(obj);
    }
    @Override
    public SysUser selectSysUserById(Long id){
        return sysUserDao.selectSysUserById(id);
    }
    @Override
    public int insertSysUser(SysUser value){
        return sysUserDao.insertSysUser(value);
    }
    @Override
    public int insertNonEmptySysUser(SysUser value){
        return sysUserDao.insertNonEmptySysUser(value);
    }
    @Override
    public int insertSysUserByBatch(List<SysUser> value){
        return sysUserDao.insertSysUserByBatch(value);
    }
    @Override
    public int deleteSysUserById(Long id){
        return sysUserDao.deleteSysUserById(id);
    }

/*
    public int updateSysUserById(SysUser enti){
        return sysUserDao.updateSysUserById(enti);
    }
*/
    @Override
    public int updateNonEmptySysUserById(SysUser enti){
        return sysUserDao.updateNonEmptySysUserById(enti);
    }

    public SysUserDao getSysUserDao() {
        return this.sysUserDao;
    }

    public void setSysUserDao(SysUserDao sysUserDao) {
        this.sysUserDao = sysUserDao;
    }

}