package com.github.design.adapter;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/14 11:31
 * @Email: chongzhao66@gmail.com
 */
public class Connector
{
    public Connector(TypeC typeC)
    {
        System.out.println("connected.");
        typeC.stream();
    }
}
