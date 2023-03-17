package com.nachogl1.reviewingpatterns.structural.decorator.kata;

public class OatMilk extends DrinkDecorator {
    public OatMilk(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Oat Milk shot";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}