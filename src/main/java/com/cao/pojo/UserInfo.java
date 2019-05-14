package com.cao.pojo;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private Integer userid;

    private String username;

    private String userpass;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }
}