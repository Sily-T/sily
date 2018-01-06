package com.sily.service.Impl;

import com.sily.api.SysRole;
import com.sily.dao.SysRoleDao;
import com.sily.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 14:14 2018/1/6
 * @Modified By:
 **/
@Service
public class SysRoleServiceImpl implements SysRoleService{

    @Autowired
    SysRoleDao sysRoleDao;

    /**
     * 获得SysRole数据集合
     * @return List<SysRole>
     */
    @Override
    public List<SysRole> selectSysRole() {
        return sysRoleDao.selectSysRole();
    }
}
