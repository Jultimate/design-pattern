package com.github.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/10 18:28
 * @Email: chongzhao66@gmail.com
 */
public class Sale extends Active
{
    @Override
    public void act(Object obj)
    {
        for(Observer observer : observers)
        {
            observer.watch(obj);
        }
    }
}
