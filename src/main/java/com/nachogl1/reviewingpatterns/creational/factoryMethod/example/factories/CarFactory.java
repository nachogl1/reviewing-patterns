package com.nachogl1.reviewingpatterns.creational.factoryMethod.example.factories;

import com.nachogl1.reviewingpatterns.creational.factoryMethod.example.someEntities.Car;

public abstract class CarFactory {

    public Car makeCar() {
        return createCar();
    }

    protected abstract Car createCar();

}
