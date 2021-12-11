package com.github.design.flyweight;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/11 15:39
 * @Email: chongzhao66@gmail.com
 */
public abstract class Car {

    String name;

    public Car(String name){
        this.name = name;
    }

    public void drive(){
        System.out.println("Drive a " + name);
    }

}
