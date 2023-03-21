package com.nachogl1.reviewingpatterns.structural.composite.kata;

public class Game extends Product {

    public Game(String name, int price) {
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
