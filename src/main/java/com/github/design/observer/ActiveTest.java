package com.github.design.observer;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/10 20:08
 * @Email: chongzhao66@gmail.com
 */
public class ActiveTest {

    public static void main(String[] args)
    {
        Active active = new Sale();
        active.add(new PriceObserver());
        Goods goods = new Goods();
        active.act(goods);
        System.out.println(goods.price);
    }
}
