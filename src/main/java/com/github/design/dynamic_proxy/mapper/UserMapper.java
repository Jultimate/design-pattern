package com.github.design.dynamic_proxy.mapper;

import com.github.design.dynamic_proxy.mapper.User;

public interface UserMapper {
    User selectById(Long userId);
}

