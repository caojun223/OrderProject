package com.cao.service;

import com.cao.pojo.UserInfo;

public interface UserInfoService {

//    Boolean checkUser(UserInfo userInfo);

    UserInfo selectByPrimaryKeyUname(String username);

//    UserInfo findUserByName(String username);
}
