package com.github.design.abstraction.game;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 15:10
 * @Email: chongzhao66@gmail.com
 */
public abstract class FPS implements Game {

    @Override
    public void play(){
        shoot();
    }

    abstract void shoot();
}
