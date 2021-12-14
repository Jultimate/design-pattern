package com.github.design.command;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/14 22:09
 * @Email: chongzhao66@gmail.com
 */
public abstract class Command
{
    private String name;

    private final Mouse mouse;

    public Command(String name, Mouse mouse)
    {
        this.name = name;
        this.mouse = mouse;
    }

    public void execute()
    {
        mouse.click();
        System.out.println(name + " execution.");
    }
}

class Cut extends Command
{
    public Cut(Mouse mouse)
    {
        super("CUT", mouse);
    }
}

class Copy extends Command
{
    public Copy(Mouse mouse)
    {
        super("COPY", mouse);
    }
}
