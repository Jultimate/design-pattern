package com.github.design.dynamic_proxy.mapper;

import java.lang.reflect.Proxy;
import java.util.Objects;

public class CrudService {
    
    private UserMapper userMapper;

    public User queryById(Long userId) {
        userMapper = (UserMapper) Proxy.newProxyInstance(UserMapper.class.getClassLoader(), new Class<?>[]{UserMapper.class},
                (proxy, method, args) -> {
                    // mock
                    User user = new User(10L, "Vincent");

                    if (args[0] instanceof Long) {
                        Long id = Long.parseLong(args[0].toString());
                        if (Objects.equals(user.id, id)) {
                            return user;
                        }
                    }
                    return null;
                });
        return userMapper.selectById(userId);
    }
}
