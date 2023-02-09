package com.nachogl1.reviewingpatterns.behavioural.visitor.kata.client;

public enum Discounts {
    INDIVIDUALS(5),
    PRIVATE_INSTITUTION(5),
    PUBLIC_INSTITUTION(10),
    INTERNATIONAL_ENTITY(3);

    private final int discount;

    Discounts(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
