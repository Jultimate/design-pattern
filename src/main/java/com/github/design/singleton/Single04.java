package com.github.design.singleton;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/05 22:40
 * @Email: chongzhao66@gmail.com
 */
public class Single04 {

    // private contructor
    private Single04(){}

    static class Single{
        private static final Single04 INSTANCE = new Single04();
    }

    public static Single04 getInstance(){
        return Single.INSTANCE;
    }

    public static void main(String[] args){
        Single04 instance = Single.INSTANCE;
    }
}
