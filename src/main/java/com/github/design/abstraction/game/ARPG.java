package com.github.design.abstraction.game;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 15:11
 * @Email: chongzhao66@gmail.com
 */
public abstract class ARPG implements Game {

    @Override
    public void play(){
        fight();
    }

    abstract void fight();
}
