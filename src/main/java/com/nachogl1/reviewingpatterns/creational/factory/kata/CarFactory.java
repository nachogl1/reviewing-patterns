package com.nachogl1.reviewingpatterns.creational.factory.kata;

public class CarFactory {

    public static Car createHondaCar(String model, int year) {
        return new HondaCar(model, year);
    }

    public static Car createVolvoCar(String model, int year) {
        return new VolvoCar(model, year);
    }
}
