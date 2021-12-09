package com.github.design.decorator;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/09 18:07
 * @Email: chongzhao66@gmail.com
 */
public class RedBuff extends Buff
{
    public RedBuff(Legend legend)
    {
        this.legend = legend;
        doBuff();
    }

    @Override
    public void doBuff()
    {
        legend.dot += 10;
        System.out.println("Legend have red buff.");
    }
}


