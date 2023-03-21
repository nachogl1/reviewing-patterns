package com.nachogl1.reviewingpatterns.structural.composite.example;

public abstract class Product implements Box{
    protected final String title;
    protected final int price;

    public Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
