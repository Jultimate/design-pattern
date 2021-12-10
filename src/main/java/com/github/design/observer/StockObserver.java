package com.github.design.observer;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/10 18:20
 * @Email: chongzhao66@gmail.com
 */
public class StockObserver implements Observer {

    @Override
    public void watch(Object obj) {
        if (obj instanceof Goods) {
            Goods goods = (Goods) obj;
            if (goods.stock < 10) {
                throw new RuntimeException("StockException");
            }
        }
    }
}

