/***********************************************************
 * @Description : 权限封装
 * @author      : 大神(hhh)
 * @date        : 2019/11/18 0:34
 * @email       : owen@qq.com
 ***********************************************************/
package com.library.owen.admin.security;

import org.springframework.security.core.GrantedAuthority;

public class GrantedAuthorityImpl implements GrantedAuthority {
    private static final long serialVersionUID = 1L;

    private String authority;

    public GrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
