package com.nachogl1.reviewingpatterns.creational.factoryMethod.kata;

public class MotorbikeFactory extends VehicleFactory {
    @Override
    protected Vehicle createCar(String brand, String model, int year) {
        return new MotorBike(brand, model, year);
    }
}
