package com.github.design.flyweight;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/11 15:51
 * @Email: chongzhao66@gmail.com
 */
public class BranTest {
    public static void main(String[] args){
        Bran bran = new Bran();
        Car car = bran.getCar("NISSAN");
        car.drive();
    }
}
