package com.nachogl1.reviewingpatterns.creational.factoryMethod.factories;

import com.nachogl1.reviewingpatterns.creational.factoryMethod.someEntities.Car;
import com.nachogl1.reviewingpatterns.creational.factoryMethod.someEntities.ElectricCar;

public class ElectricCarFactory extends  CarFactory{
    @Override
    protected Car createCar() {
        return new ElectricCar();
    }
}
