package com.github.design.memento;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/17 18:09
 * @Email: chongzhao66@gmail.com
 */
public class Archive
{
    private final DarkSouls darkSouls;

    int num;

    public Archive(DarkSouls darkSouls)
    {
        //克隆当前游戏状态
        this.darkSouls = darkSouls.clone();
    }

    public DarkSouls getDarkSouls()
    {
        return this.darkSouls;
    }
}
