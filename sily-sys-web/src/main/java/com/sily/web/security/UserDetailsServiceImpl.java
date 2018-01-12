package com.sily.web.security;

import com.sily.api.SysRole;
import com.sily.api.SysUser;
import com.sily.dao.SysLoginDao;
import com.sily.dao.SysRoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private SysLoginDao sysLoginDao;
    @Autowired
    private SysRoleDao sysRoleDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        SysUser sysUser = sysLoginDao.selectByLoginName("admin");
        if (sysUser == null) {
            System.out.println("用户不存在");
            throw new UsernameNotFoundException("没有找到该用户名");
        }
        SysRole sysRole = sysRoleDao.selectRoleByUserId(sysUser.getId());
        List<GrantedAuthority> authorities = new ArrayList<>();
        System.out.println(sysRole.getRoleName());
        authorities.add(new SimpleGrantedAuthority(sysRole.getRoleName()));
        System.out.println("authorities:" + authorities);
        return new User(sysUser.getAccount(), sysUser.getPassword(), authorities);
    }

    private List<SysRole> getGrantedAuthorities(SysRole ysRole) {
        List<SysRole> authorities = new ArrayList<SysRole>();

//        for (UserProfile userProfile : psRole.getRoleName()) {
//            System.out.println("UserProfile : " + userProfile);
//            authorities.add(new SimpleGrantedAuthority("ROLE_" + userProfile.getType()));
//        }
        System.out.print("authorities :" + authorities);
        return authorities;
    }

}
