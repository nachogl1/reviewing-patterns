package com.nachogl1.reviewingpatterns.creational.factoryMethod.factories;

import com.nachogl1.reviewingpatterns.creational.factoryMethod.someEntities.Car;
import com.nachogl1.reviewingpatterns.creational.factoryMethod.someEntities.DieselCar;

public class DieselCarFactory extends CarFactory{
    @Override
    protected Car createCar() {
        return new DieselCar();
    }
}
