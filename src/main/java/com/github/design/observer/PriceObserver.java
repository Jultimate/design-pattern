package com.github.design.observer;

import java.math.BigDecimal;

public class PriceObserver implements Observer {
    @Override
    public void watch(Object obj) {
        if (obj instanceof Goods) {
            Goods goods = (Goods) obj;

            // from sql
            BigDecimal currentPrice = new BigDecimal("3200.0");
            if (goods.price.compareTo(currentPrice) != 0) {
                goods.price = currentPrice;
            }
        }
    }
}
