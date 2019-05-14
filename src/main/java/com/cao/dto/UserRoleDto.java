package com.cao.dto;

public class UserRoleDto {
    private int userid;
    private int roleid;
    private String username;
    private String userpass;
    private String rolename;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "UserRoleDto{" +
                "userid=" + userid +
                ", roleid=" + roleid +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
