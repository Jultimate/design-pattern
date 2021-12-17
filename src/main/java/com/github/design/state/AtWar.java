package com.github.design.state;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/17 22:49
 * @Email: chongzhao66@gmail.com
 */
public class AtWar
{
    private final WarState warState;

    public AtWar(WarState warState)
    {
        this.warState = warState;
    }

    public void warfare()
    {
        warState.battle();
    }
}
