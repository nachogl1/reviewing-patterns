package com.nachogl1.reviewingpatterns.creational.factoryMethod.example.someEntities;

public class DieselCar implements Car{
    @Override
    public void fillUp() {
        System.out.println("Fill up tank with Diesel");
    }
}
