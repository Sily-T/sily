package com.sily.web.security.auth;

import com.sily.api.SysUser;
import com.sily.dao.SysUserDao;
import com.sily.web.security.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

import static java.util.Arrays.asList;

@Service
public class AuthServiceImpl implements AuthService {

    private AuthenticationManager authenticationManager;
    private UserDetailsService userDetailsService;
    private JwtTokenUtil jwtTokenUtil;
    private SysUserDao sysUserDao;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    public AuthServiceImpl(
            AuthenticationManager authenticationManager,
            UserDetailsService userDetailsService,
            JwtTokenUtil jwtTokenUtil,
            SysUserDao sysUserDao) {
        this.authenticationManager = authenticationManager;
        this.userDetailsService = userDetailsService;
        this.jwtTokenUtil = jwtTokenUtil;
        this.sysUserDao = sysUserDao;
    }

    /**
     * 更新token
     *
     * @param userToAdd
     * @return com.sily.api.SysUser
     * Date: 2018/1/12
     */
    @Override
    public SysUser register(SysUser userToAdd) {
        final String account = userToAdd.getAccount();
//        if (sysUserDao.findByUsername(account) != null) {
        if (sysUserDao.selectSysUserByAccount(account) == null) {
            return null;
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        final String rawPassword = userToAdd.getPassword();
        userToAdd.setPassword(encoder.encode(rawPassword));
        userToAdd.setUpdateTime(new Date());
//        此处需要为新建的用户指定角色
//        userToAdd.setRoles(asList("普通用户"));
//        此处dao已经做了返回自增id的处理2018年1月12日
        sysUserDao.insertSysUser(userToAdd);
//        或许此处还要做一次查询,因为插入的数据密码已经被加密了

        return userToAdd;
    }

    @Override
    public String login(String username, String password) {
        UsernamePasswordAuthenticationToken upToken = new UsernamePasswordAuthenticationToken(username, password);
        // Perform the security
        final Authentication authentication = authenticationManager.authenticate(upToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Reload password post-security so we can generate token
        final UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        final String token = jwtTokenUtil.generateToken(userDetails);
        return token;
    }

    @Override
    public String refresh(String oldToken) {
        final String token = oldToken.substring(tokenHead.length());
        String username = jwtTokenUtil.getUsernameFromToken(token);
        SysUser user = (SysUser) userDetailsService.loadUserByUsername(username);
        if (jwtTokenUtil.canTokenBeRefreshed(token, user.getUpdateTime())) {
            return jwtTokenUtil.refreshToken(token);
        }
        return null;
    }
}
