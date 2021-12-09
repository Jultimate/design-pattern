package com.github.design.proxy;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/09 16:44
 * @Email: chongzhao66@gmail.com
 */
public class TrafficFilter {

    public static boolean filter(Traffic traffic){
        if(!(traffic instanceof RealTraffic)){
            System.out.println("pass through filter.");
            return true;
        }
        throw new RuntimeException("TrafficException.");
    }

    public static void main(String[] args){
        Traffic traffic1 = new RealTraffic();
        Traffic traffic2 = new ProxyTraffic();
        if(filter(traffic2)){
            traffic2.stream();
        }
//        boolean filter = filter(traffic1);
    }
}
