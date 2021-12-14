package com.github.design.adapter;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/14 11:31
 * @Email: chongzhao66@gmail.com
 */
public interface RJ45
{
    void transmit();
}

class NettingTwine implements RJ45
{
    @Override
    public void transmit()
    {
        System.out.println("Internet Data Transfer.");
    }
}
