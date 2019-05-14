package com.cao.service;

import com.cao.dto.UserRoleDto;

public interface UserRoleDtoService {

    UserRoleDto selectRoleByUserName(String username);
}
