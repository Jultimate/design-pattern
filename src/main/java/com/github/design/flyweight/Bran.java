package com.github.design.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/11 15:38
 * @Email: chongzhao66@gmail.com
 */
public class Bran {

    private final Map<String, Car> myCars = new HashMap<>();

    public void put(String name, Car car) {
        myCars.put(name, car);
    }

    public Car getCar(String name) {
        Car car = myCars.get(name);
        if (car == null) {
            car = CarFactory.buyCar(name);
        }
        return car;
    }

}
