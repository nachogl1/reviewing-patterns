package com.nachogl1.reviewingpatterns.structural.decorator.kata;

public class CaramelSyrup extends DrinkDecorator {
    public CaramelSyrup(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Caramel Syrup shot";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
