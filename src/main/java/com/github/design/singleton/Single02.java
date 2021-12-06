package com.github.design.singleton;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description: lazy loading
 * @Author: CHONG
 * @CreateTime: 2021/12/05 22:14
 * @Email: chongzhao66@gmail.com
 */
public class Single02 {

    private static Single02 instance;

    // private constructor
    private Single02() {

    }

    public static Single02 getInstance() {
        if (null == instance) {
            instance = new Single02();
        }
        return instance;
    }

    public static void main(String[] args) throws InterruptedException {

        Set<Single02> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Single02 instance = Single02.getInstance();
                set.add(instance);
                System.out.println(instance.hashCode());
            }).start();
        }

        Thread.sleep(100);
        if(set.size() > 1){
            System.out.println("线程不安全！！！");
        }



    }


}
