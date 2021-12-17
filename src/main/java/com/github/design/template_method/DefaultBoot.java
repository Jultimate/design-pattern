package com.github.design.template_method;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/17 19:54
 * @Email: chongzhao66@gmail.com
 */
public class DefaultBoot extends Bootstrap
{
    @Override
    protected void before()
    {
        System.out.println("初始化之前。。。。。。");
    }

    @Override
    protected void init()
    {
        System.out.println("初始化方法。。。。。。");
    }

    @Override
    protected void after()
    {
        System.out.println("初始化之后。。。。。。");
    }
}
