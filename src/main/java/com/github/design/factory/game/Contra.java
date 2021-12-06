package com.github.design.factory.game;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 14:13
 * @Email: chongzhao66@gmail.com
 */
public class Contra implements Game{

    @Override
    public void play() {
        System.out.println("play Contra with 30HP.");
    }
}
