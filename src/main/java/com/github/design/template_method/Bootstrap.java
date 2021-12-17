package com.github.design.template_method;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/17 19:54
 * @Email: chongzhao66@gmail.com
 */
public abstract class Bootstrap
{

    protected abstract void before();

    protected abstract void init();

    protected abstract void after();

    public void start()
    {
        before();
        init();
        after();
    }
}
