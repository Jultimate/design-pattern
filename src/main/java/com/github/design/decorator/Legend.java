package com.github.design.decorator;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/09 17:47
 * @Email: chongzhao66@gmail.com
 */
public class Legend {

    protected Integer damage = 70;

    protected Integer dot = 0;

    protected Double coldDown = 6d;

    public void attack()
    {
        System.out.println(damage + " damage every time, damage over time " + dot + " , skill cold down " + coldDown + " second.");
    }
}
