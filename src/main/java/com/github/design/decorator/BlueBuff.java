package com.github.design.decorator;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/09 18:09
 * @Email: chongzhao66@gmail.com
 */
public class BlueBuff extends Buff
{
    public BlueBuff(Legend legend)
    {
        this.legend = legend;
        doBuff();
    }

    @Override
    public void doBuff()
    {
        legend.coldDown *= 0.75;
        System.out.println("Legend have blue buff.");
    }
}
