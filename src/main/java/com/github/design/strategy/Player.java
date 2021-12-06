package com.github.design.strategy;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 12:34
 * @Email: chongzhao66@gmail.com
 */
public class Player {

    public static void main(String[] args){
        StartGame.start(new AI1());
        StartGame.start(new AI2());
        StartGame.start(new AI3());
    }
}
