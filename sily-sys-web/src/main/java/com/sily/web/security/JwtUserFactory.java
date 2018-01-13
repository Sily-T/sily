package com.sily.web.security;

import java.util.List;
import java.util.stream.Collectors;


import com.sily.api.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 * 此类只是作为工厂类，实例化sysuser
 * Date: 2018/1/12
 */
public final class JwtUserFactory {


    private JwtUserFactory() {
    }

    public static SysUser create(SysUser sysUser) {
        SysUser newSysUser=new SysUser();
        newSysUser.setId(sysUser.getId());
        newSysUser.setAccount(sysUser.getAccount());
        newSysUser.setPassword(sysUser.getPassword());
        newSysUser.setEmail(sysUser.getEmail());
        newSysUser.setUpdateTime(sysUser.getUpdateTime());
        return newSysUser;
//        2018-01-12，因为以下情况导致需要在类中重写构造器，所以导致新的dao层查询找不到构造器,因此暂用以上方法
//        return new SysUser(
//                sysUser.getId(),
//                sysUser.getAccount(),
//                sysUser.getPassword(),
//                sysUser.getEmail(),
//                sysUser.getUpdateTime()
////                mapToGrantedAuthorities(sysUser.getRoles())
//        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<String> authorities) {
        return authorities.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
}

