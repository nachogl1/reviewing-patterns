package com.nachogl1.reviewingpatterns.creational.factoryMethod.kata;

public class CarFactory extends VehicleFactory {
    @Override
    protected Vehicle createCar(String brand, String model, int year) {
        return new Car(brand, model, year);
    }
}
