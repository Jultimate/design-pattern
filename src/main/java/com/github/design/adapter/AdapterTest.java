package com.github.design.adapter;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/14 11:31
 * @Email: chongzhao66@gmail.com
 */
public class AdapterTest
{
    public static void main(String[] args)
    {
        new Connector(new Charger());
        System.out.println();
        new Connector(new Adapter(new NettingTwine()));
    }
}
