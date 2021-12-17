package com.github.design.state;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/17 22:49
 * @Email: chongzhao66@gmail.com
 */
public interface WarState
{
    void battle();
}

class WWIstate implements WarState
{
    @Override
    public void battle()
    {
        System.out.println("绞肉机。。。。。。");
    }
}

class WWIIstate implements WarState
{
    @Override
    public void battle()
    {
        System.out.println("装甲集群正面刚。。。。。。");
    }
}

class GulfWar implements WarState
{
    @Override
    public void battle()
    {
        System.out.println("信息化作战。。。。。。");
    }
}
