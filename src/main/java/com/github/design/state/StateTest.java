package com.github.design.state;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/17 22:50
 * @Email: chongzhao66@gmail.com
 */
public class StateTest
{
    public static void main(String[] args)
    {
        AtWar war = new AtWar(new GulfWar());

        war.warfare();
    }
}
