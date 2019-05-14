package com.cao.shiro;

import com.cao.mapper.UserInfoMapper;
import com.cao.pojo.UserInfo;
import com.cao.service.UserInfoService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;


public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserInfoMapper userInfoMapper;
    String password;

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String string = principalCollection.toString();
        System.out.println(string);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Object principal = principalCollection.getPrimaryPrincipal();
        if ("admin".equals(principal)){
            info.addRole("admin");
        }
        if ("user".equals(principal)){
            info.addRole("list");
        }
        info.addRole("user");
        return info;
    }

    /**
     * 验证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //1. token 中获取登录的 username
        Object principal = token.getPrincipal();

        //2. 利用 username 查询数据库得到用户的信息.
        UserInfo userInfo = userInfoMapper.selectByPrimaryKeyUname((String) principal);
        if (userInfo!=null){
            password=userInfo.getUserpass();
        }

        String name = getName();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(principal, password, name);
        return info;
    }
}
