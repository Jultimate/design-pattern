package com.github.design.memento;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/17 18:12
 * @Email: chongzhao66@gmail.com
 */
public class Test
{
    public static void main(String[] args)
    {
        //保存页面
        SavePage savePage = new SavePage();

        //开始玩黑暗之魂
        DarkSouls beforeBattle = new DarkSouls("古龙之顶","19:34:00","180000");

        //进入雾门与无名战斗前切到文件管理器手动备份存档
        Archive archive = new Archive(beforeBattle);
        savePage.save(archive);

        beforeBattle.fight(24);

        System.out.println(beforeBattle.souls);

        //没打过，还原存档
        Archive load = savePage.load(0);
        DarkSouls callback = load.getDarkSouls();
        System.out.println(callback.territory);

    }
}
