package com.nachogl1.reviewingpatterns.creational.factoryMethod.factories;

import com.nachogl1.reviewingpatterns.creational.factoryMethod.someEntities.Car;

public abstract class CarFactory {

    public Car makeCar() {
        Car car = createCar();
        //do other common logic to set up the car
        return car;
    }

    protected abstract Car createCar();

}
