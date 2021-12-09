package com.github.design.decorator;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/09 18:11
 * @Email: chongzhao66@gmail.com
 */
public class DecoratorTest {

    public static void main(String[] args){
        Legend legend = new Legend();
        legend.attack();

        Buff redBuff = new RedBuff(legend);
        legend.attack();

        Buff blueBuff = new BlueBuff(legend);
        legend.attack();
    }
}
