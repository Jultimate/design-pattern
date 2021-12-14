package com.github.design.command;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/14 22:10
 * @Email: chongzhao66@gmail.com
 */
public class Test
{
    public static void main(String[] args)
    {
        Mouse mouse = new Mouse();

        Command cut = new Cut(mouse);
        Command copy = new Copy(mouse);

        Invoker cutInvoke = new Invoker(cut);
        cutInvoke.invoke();

        Invoker copyInvoke = new Invoker(copy);
        copyInvoke.invoke();
    }
}
