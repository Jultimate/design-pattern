package com.github.design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/13 18:57
 * @Email: chongzhao66@gmail.com
 */
public class Sync
{
    private final List<Master> masters = new ArrayList<>();

    public void attach(Master master)
    {
        masters.add(master);
    }

    public void sync(Slave slave)
    {
        for(Master master : masters)
        {
            master.send(slave);
        }
    }
}
