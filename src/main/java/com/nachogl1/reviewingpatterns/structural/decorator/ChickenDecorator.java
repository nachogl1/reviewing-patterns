package com.nachogl1.reviewingpatterns.structural.decorator;

public class ChickenDecorator extends PizzaDecorator {
    public ChickenDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected String getDecoratorName() {
        return "and chicken";
    }

    @Override
    protected int getDecoratorPrice() {
        return 6;
    }
}
