package com.github.design.factory.game;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 14:11
 * @Email: chongzhao66@gmail.com
 */
public class Mario implements Game{

    @Override
    public void play() {
        System.out.println("play Mario.");
    }
}
