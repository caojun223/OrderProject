package com.cao.service.impl;

import com.cao.dto.UserRoleDto;
import com.cao.mapper.UserRoleDtoMapper;
import com.cao.service.UserRoleDtoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserRoleDtoServiceImpl implements UserRoleDtoService {

    @Resource
    private UserRoleDtoMapper userRoleDtoMapper;

    @Override
    public UserRoleDto selectRoleByUserName(String username) {
        return userRoleDtoMapper.selectRoleByUserName(username);
    }
}
