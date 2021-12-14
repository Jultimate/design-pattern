package com.github.design.bridge;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/14 14:14
 * @Email: chongzhao66@gmail.com
 */
public abstract class Laptop
{
    String type;

    Storage storage;

    public Laptop(String type, Storage storage)
    {
        this.type = type;
        this.storage = storage;
    }
}

class GameLaptop extends Laptop
{
    public GameLaptop(Storage storage)
    {
        super("GAME", storage);
    }
}

class BusinessLaptop extends Laptop
{
    public BusinessLaptop(Storage storage)
    {
        super("BUSINESS", storage);
    }
}

class LightLaptop extends Laptop
{
    public LightLaptop(Storage storage)
    {
        super("LIGHT", storage);
    }
}
