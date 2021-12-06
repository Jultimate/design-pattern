package com.github.design.strategy;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/06 12:30
 * @Email: chongzhao66@gmail.com
 */
public class AI3 implements RedAlert3Strategy{
    @Override
    public void palyGame() {
        System.out.println("AI3选择盟军阵营");
    }
}
