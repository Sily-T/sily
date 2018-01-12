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
        return new SysUser(
                sysUser.getId(),
                sysUser.getAccount(),
                sysUser.getPassword(),
                sysUser.getEmail(),
                sysUser.getUpdateTime()
//                mapToGrantedAuthorities(sysUser.getRoles())
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<String> authorities) {
        return authorities.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
}

