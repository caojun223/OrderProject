package com.cao.controller;

import com.cao.dto.UserRoleDto;
import com.cao.pojo.UserInfo;
import com.cao.service.UserRoleDtoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserRoleDtoController {

    @Resource
    private UserRoleDtoService userRoleDtoService;

//    @RequestMapping("/selectByPrimaryKeyUname")
    @ResponseBody
    public Object selectByPrimaryKeyUname(@RequestBody UserInfo userInfo){
        System.out.println(123);
        String username = userInfo.getUsername();
        UserRoleDto userRoleDto = userRoleDtoService.selectRoleByUserName(username);
        String userpass = userRoleDto.getUserpass();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,userpass);
        try {
            subject.login(token);
            System.out.println(124);
        } catch (AuthenticationException e) {
            System.out.println("登录失败："+e.getMessage());
            e.printStackTrace();
            return -1;
        }
        return 1;
    }
}
