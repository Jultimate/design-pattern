package com.github.design.strategy;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 12:31
 * @Email: chongzhao66@gmail.com
 */
public class StartGame {

    private static RedAlert3Strategy strategy;


    public StartGame(RedAlert3Strategy strategy){
        StartGame.strategy = strategy;
    }

    public static void start(RedAlert3Strategy strategy){
        StartGame.strategy = strategy;
        strategy.palyGame();
    }
}
