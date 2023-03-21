package com.nachogl1.reviewingpatterns.structural.composite.kata;

public abstract class Product implements CompositeItem {
    protected final String name;
    protected final int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return this.price;
    }
}
