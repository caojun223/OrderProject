package com.cao.mapper;

import com.cao.dto.UserRoleDto;

public interface UserRoleDtoMapper {

    UserRoleDto selectRoleByUserName(String username);
}
