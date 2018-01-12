package com.sily.web.security.auth;


import com.sily.api.SysUser;

public interface AuthService {
    SysUser register(SysUser userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}
