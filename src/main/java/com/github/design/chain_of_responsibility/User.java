package com.github.design.chain_of_responsibility;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/09 23:16
 * @Email: chongzhao66@gmail.com
 */
public class User {
    String name;

    String pwd;

    String role;

    Integer age;

    public User(String name,String pwd,String role,Integer age)
    {
        this.name = name;
        this.pwd = pwd;
        this.role = role;
        this.age = age;
    }
}

