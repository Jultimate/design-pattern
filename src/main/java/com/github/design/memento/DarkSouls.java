package com.github.design.memento;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/17 18:09
 * @Email: chongzhao66@gmail.com
 */
public class DarkSouls implements Cloneable
{
    String territory;

    String time;

    String souls;

    public DarkSouls(String territory, String time, String souls)
    {
        this.territory = territory;
        this.time = time;
        this.souls = souls;
    }

    public void fight(int level)
    {
        if(level < 35)
        {
            this.territory = "伊鲁席尔地牢";
            this.time = "19:40:00";
            this.souls = "0";
            System.out.println("没打过无名之王！！！");
        }
        else
        {
            System.out.println("击败了无名之王！！！");
        }
    }

    @Override
    public DarkSouls clone() {
        try {
            DarkSouls clone = (DarkSouls) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
