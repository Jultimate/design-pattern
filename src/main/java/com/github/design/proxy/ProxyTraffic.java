package com.github.design.proxy;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/09 15:17
 * @Email: chongzhao66@gmail.com
 */
public class ProxyTraffic implements Traffic {
    private final Traffic traffic = new RealTraffic();
    @Override
    public void stream() {
        if(connect()){
            traffic.stream();
        }
    }

    public boolean connect(){
        System.out.println("proxy server connected.");
        return true;
    }
    public static void main(String[] args){
        Traffic traffic = new ProxyTraffic();
        traffic.stream();
    }
}
