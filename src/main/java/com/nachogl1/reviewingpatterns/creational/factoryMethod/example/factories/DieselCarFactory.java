package com.nachogl1.reviewingpatterns.creational.factoryMethod.example.factories;

import com.nachogl1.reviewingpatterns.creational.factoryMethod.example.someEntities.Car;
import com.nachogl1.reviewingpatterns.creational.factoryMethod.example.someEntities.DieselCar;

public class DieselCarFactory extends CarFactory{
    @Override
    protected Car createCar() {
        return new DieselCar();
    }
}
