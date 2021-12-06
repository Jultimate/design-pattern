package com.github.design.strategy;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 12:28
 * @Email: chongzhao66@gmail.com
 */
public class AI1 implements RedAlert3Strategy {
    @Override
    public void palyGame() {
        System.out.println("AI1选择旭日阵营");
    }
}
