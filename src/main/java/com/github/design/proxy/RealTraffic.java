package com.github.design.proxy;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/09 15:17
 * @Email: chongzhao66@gmail.com
 */
public class RealTraffic implements Traffic {
    @Override
    public void stream() {
        System.out.println("search in google.");
    }
}
