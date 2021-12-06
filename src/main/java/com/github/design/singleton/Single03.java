package com.github.design.singleton;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/05 22:25
 * @Email: chongzhao66@gmail.com
 */
public class Single03 {

    //volatile avoid construction rearrange
    private static volatile Single03 instance;

    private Single03(){}

    public static Single03 getInstance(){
        if(null == instance){
            synchronized (Single03.class){
                if(null == instance){
                    instance = new Single03();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                Single03 instance = Single03.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }

    }


}
