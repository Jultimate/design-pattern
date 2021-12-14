package com.github.design.command;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/14 22:17
 * @Email: chongzhao66@gmail.com
 */
public class Invoker
{
    private final Command command;

    public Invoker(Command command)
    {
        this.command = command;
    }

    public void invoke()
    {
        command.execute();
    }
}
