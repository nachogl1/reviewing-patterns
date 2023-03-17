package com.nachogl1.reviewingpatterns.structural.decorator.kata;

public class BaseCoffee implements Drink {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
