package com.nachogl1.reviewingpatterns.structural.composite.kata;

public class Book extends Product {
    public Book(String name, int price) {
        super(name, price);
    }

    @Override
    public int calculatePrice() {
        return getPrice();
    }


    @Override
    public String getNameOfItems() {
        return getName();
    }
}
