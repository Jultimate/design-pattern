package com.github.design.strategy;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 12:29
 * @Email: chongzhao66@gmail.com
 */
public class AI2 implements RedAlert3Strategy{
    @Override
    public void palyGame(Player player) {
        System.out.println("AI2选择苏联阵营与玩家" + player.name + "作战");
    }
}
