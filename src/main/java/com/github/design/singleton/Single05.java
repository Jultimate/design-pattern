package com.github.design.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description: enum singleton
 * @Author: CHONG
 * @CreateTime: 2021/12/05 23:14
 * @Email: chongzhao66@gmail.com
 */
public enum Single05 {

    INSTANCE;

    public void a(){}

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for (int i = 0; i < 100; i++) {
            System.out.println(Single05.INSTANCE.hashCode());
        }
        Class<Single05> clazz = Single05.class;
        Constructor<Single05> constructor = clazz.getConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
        System.out.println(Single05.INSTANCE);
    }
}
