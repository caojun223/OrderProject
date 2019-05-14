package com.cao.service.impl;

import com.cao.mapper.UserInfoMapper;
import com.cao.pojo.UserInfo;
import com.cao.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

//    @Override
//    public Boolean checkUser(UserInfo userInfo) {
////        List<UserInfo> userInfos=userInfoMapper.checkUser(userInfo);
////        if (userInfos.size()>0){
////            return true;
////        }
//        return false;
//    }

    @Override
    public UserInfo selectByPrimaryKeyUname(String username) {
        return userInfoMapper.selectByPrimaryKeyUname(username);
    }

//    @Override
//    public Boolean checkUser(UserInfo userInfo) {
//        return null;
//    }

//    @Override
//    public UserInfo findUserByName(String username) {
//        return userInfoMapper.findUserByName(username);
//    }
}
