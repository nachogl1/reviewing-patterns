package com.nachogl1.reviewingpatterns.creational.factoryMethod.factories;

import com.nachogl1.reviewingpatterns.creational.factoryMethod.someEntities.Car;

public abstract class CarFactory {

    public Car makeCar() {
        return createCar();
    }

    protected abstract Car createCar();

}
