package com.github.design.visitor;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/13 18:54
 * @Email: chongzhao66@gmail.com
 */
public abstract class Slave
{
    String data;

    String name;

    public Slave(String name)
    {
        this.name = name;
    }

    protected void receive(Master master)
    {
        this.data = master.snapShot;
        System.out.println("从机 " + name + " 从主机 " + master.name + " 接收到的数据为：" + this.data);
    }

}

class SlaveOne extends Slave
{
    public SlaveOne()
    {
        super("SLAVE_ONE");
    }
}

class SlaveTwo extends Slave
{
    public SlaveTwo()
    {
        super("SLAVE_TWO");
    }
}

class SlaveThree extends Slave
{
    public SlaveThree()
    {
        super("SLAVE_THREE");
    }
}
