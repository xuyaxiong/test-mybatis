package com.example.mapper;

import com.example.model.SysUser;

public interface UserMapper {
    SysUser selectById(Long id);
}
