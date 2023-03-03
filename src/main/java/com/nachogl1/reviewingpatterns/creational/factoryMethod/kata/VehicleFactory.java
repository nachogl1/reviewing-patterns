package com.nachogl1.reviewingpatterns.creational.factoryMethod.kata;

public abstract class VehicleFactory {

    public Vehicle makeCar(String brand, String model, int year) {
        //some common potential logic
        return createCar(brand, model, year);
    }

    protected abstract Vehicle createCar(String brand, String model, int year);
}
