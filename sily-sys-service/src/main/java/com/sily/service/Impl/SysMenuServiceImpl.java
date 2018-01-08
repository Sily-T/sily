package com.sily.service.Impl;

import com.sily.api.SysMenuVo;
import com.sily.api.SysRole;
import com.sily.dao.SysMenuDao;
import com.sily.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @date 2018/1/8
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuDao sysMenuDao;

    @Override
    public List<SysMenuVo> getMenuByRoleId(SysRole sysRole) {
        System.out.println(sysRole.getId().intValue());
        return sysMenuDao.getMenuByRoleId(sysRole.getId().intValue());
    }
}
