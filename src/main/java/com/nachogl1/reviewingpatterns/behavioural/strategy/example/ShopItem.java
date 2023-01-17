package com.nachogl1.reviewingpatterns.behavioural.strategy.example;

import java.math.BigDecimal;

public class ShopItem {

    private String name;
    private BigDecimal totalPrice;

    public ShopItem(String name, BigDecimal totalPrice) {
        this.name = name;
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
}
