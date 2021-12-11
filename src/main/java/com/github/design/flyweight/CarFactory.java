package com.github.design.flyweight;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/11 15:43
 * @Email: chongzhao66@gmail.com
 */
public class CarFactory {

    public static Car buyCar(String name){
        switch (name)
        {
            case "VOLKSWAGEN":
                return new Volkswagen();
            case "PORSCHE":
                return new Porsche();
            case "NISSAN":
                return new Nissan();
            default:
                return null;
        }
    }
}
