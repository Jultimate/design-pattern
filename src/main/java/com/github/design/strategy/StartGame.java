package com.github.design.strategy;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 12:31
 * @Email: chongzhao66@gmail.com
 */
public class StartGame {

    private static RedAlert3Strategy strategy;

    public StartGame(RedAlert3Strategy strategy) {
        StartGame.strategy = strategy;
    }

    public static void start(Player player) {
        switch (player.group) {
            case "旭日" -> StartGame.strategy = new AI1();
            case "苏联" -> StartGame.strategy = new AI2();
            case "盟军" -> StartGame.strategy = new AI3();
            default -> StartGame.strategy = new AI1();
        }
        strategy.palyGame(player);
    }
}
