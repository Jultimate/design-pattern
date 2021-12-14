package com.github.design.bridge;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/14 14:17
 * @Email: chongzhao66@gmail.com
 */
public class BridgeTest {
    public static void main(String[] args)
    {
        Laptop laptop = new GameLaptop(new SchemaOne());
        System.out.println(laptop.storage.capacity);
    }
}
