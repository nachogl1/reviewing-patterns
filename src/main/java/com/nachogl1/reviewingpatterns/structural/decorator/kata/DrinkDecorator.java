package com.nachogl1.reviewingpatterns.structural.decorator.kata;

public abstract class DrinkDecorator implements Drink {
    private Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription();
    }

    @Override
    public int getPrice() {
        return drink.getPrice();
    }

}
