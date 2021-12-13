package com.github.design.visitor;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/13 19:00
 * @Email: chongzhao66@gmail.com
 */
public class ClusterTest
{
    public static void main(String[] args)
    {
        Sync sync1 = new Sync();
        Sync sync2 = new Sync();
        Sync sync3 = new Sync();

        sync1.attach(new MasterOne("SNAPSHOT_01"));
        sync2.attach(new MasterTwo("SNAPSHOT_02"));
        sync3.attach(new MasterThree("SNAPSHOT_03"));

        sync1.sync(new SlaveOne());
        sync2.sync(new SlaveTwo());
        sync3.sync(new SlaveThree());
    }
}
