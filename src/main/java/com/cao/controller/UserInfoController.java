package com.cao.controller;

import com.cao.pojo.UserInfo;
import com.cao.service.UserInfoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("/selectByPrimaryKeyUname")
    @ResponseBody
    public Object selectByPrimaryKeyUname(@RequestBody UserInfo userInfo) {
        String username = userInfo.getUsername();
        UserInfo info = userInfoService.selectByPrimaryKeyUname(username);
        if (info == null) {
            return -1;
        } else if (userInfo.getUsername().equals(info.getUsername())) {
            if (userInfo.getUserpass().equals(info.getUserpass())) {
                return 1;
            } else {
                return -1;
            }
        } else
            return 1;
    }
}
