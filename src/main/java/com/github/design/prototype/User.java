package com.github.design.prototype;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/15 21:35
 * @Email: chongzhao66@gmail.com
 */
public class User implements Cloneable
{
    String id;

    String name;

    String pwd;

    Adress adress;

    static class Adress
    {
        String country;

        String province;

        String city;
    }

    @Override
    public Object clone()
    {
        User user = null;
        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return user;
    }
}
