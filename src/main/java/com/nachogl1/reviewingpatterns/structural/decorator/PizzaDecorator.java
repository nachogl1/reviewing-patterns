package com.nachogl1.reviewingpatterns.structural.decorator;

public abstract class PizzaDecorator extends Pizza {
    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int costs() {
        return this.pizza.costs() + this.getDecoratorPrice();
    }

    @Override
    public String name() {
        return this.pizza.name() + ", " + this.getDecoratorName();
    }

    protected abstract String getDecoratorName();

    protected abstract int getDecoratorPrice();

}
