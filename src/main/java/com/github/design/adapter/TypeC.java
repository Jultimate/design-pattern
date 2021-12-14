package com.github.design.adapter;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/14 11:30
 * @Email: chongzhao66@gmail.com
 */
public interface TypeC
{
    void stream();
}

class Charger implements TypeC
{
    @Override
    public void stream()
    {
        System.out.println("The laptop is being charge.");
    }
}
