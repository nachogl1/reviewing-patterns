package com.nachogl1.reviewingpatterns.structural.decorator;

public class Main {
    public static void main(String[] args){
        Pizza pizza = new TomatoDecorator(new OnionDecorator(new ChickenDecorator(new ThickBase())));
        System.out.println("Name "+ pizza.name());
        System.out.println("Price "+ pizza.costs());
    }
}
