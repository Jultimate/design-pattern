package com.github.design.bridge;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/14 14:16
 * @Email: chongzhao66@gmail.com
 */
public abstract class Storage
{
    String capacity;

    public Storage(String capacity)
    {
        this.capacity = capacity;
    }
}

class SchemaOne extends Storage
{
    public SchemaOne()
    {
        super("8G + 256G");
    }
}

class SchemaTwo extends Storage
{
    public SchemaTwo()
    {
        super("16G + 512G");
    }
}

class SchemaThree extends Storage
{
    public SchemaThree()
    {
        super("16G + 1T");
    }
}
