package com.nachogl1.reviewingpatterns.structural.decorator.example;

public class TomatoDecorator extends PizzaDecorator {

    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    protected String getDecoratorName() {
        return "and tomato";
    }

    @Override
    protected int getDecoratorPrice() {
        return 2;
    }


}
