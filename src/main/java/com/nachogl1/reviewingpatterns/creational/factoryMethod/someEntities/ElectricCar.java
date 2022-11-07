package com.nachogl1.reviewingpatterns.creational.factoryMethod.someEntities;

public class ElectricCar implements Car{
    @Override
    public void fillUp() {
        System.out.println("Charge battery");
    }
}
