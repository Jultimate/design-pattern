package com.github.design.singleton;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/05 22:09
 * @Email: chongzhao66@gmail.com
 */
public class Single01 {

    private static final Single01 INSTANCE = new Single01();

    // private constructor
    private Single01(){

    }

    public static Single01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args){
        Single01 Single011 = Single01.getInstance();
        Single01 Single012 = Single01.getInstance();
        System.out.println(Single011 == Single012);
    }
}
