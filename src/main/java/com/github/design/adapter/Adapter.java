package com.github.design.adapter;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/14 11:31
 * @Email: chongzhao66@gmail.com
 */
public class Adapter implements TypeC
{
    RJ45 rj45;

    public Adapter(RJ45 rj45)
    {
        this.rj45 = rj45;
    }

    @Override
    public void stream()
    {
        System.out.println("TypeC to RJ45");
        rj45.transmit();
    }
}
