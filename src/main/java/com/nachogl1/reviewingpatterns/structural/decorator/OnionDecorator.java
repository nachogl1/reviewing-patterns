package com.nachogl1.reviewingpatterns.structural.decorator;

public class OnionDecorator extends PizzaDecorator {
    public OnionDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected int getDecoratorPrice() {
        return 3;
    }

    @Override
    protected String getDecoratorName() {
        return "and onions";
    }

}
