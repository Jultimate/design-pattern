package com.github.design.singleton;

/**
 * @Description: enum singleton
 * @Author: CHONG
 * @CreateTime: 2021/12/05 23:14
 * @Email: chongzhao66@gmail.com
 */
public enum Single05 {

    INSTANCE;

    public void a(){}

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            System.out.println(Single05.INSTANCE.hashCode());
        }
    }
}
