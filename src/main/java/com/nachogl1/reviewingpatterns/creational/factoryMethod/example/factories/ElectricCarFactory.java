package com.nachogl1.reviewingpatterns.creational.factoryMethod.example.factories;

import com.nachogl1.reviewingpatterns.creational.factoryMethod.example.someEntities.Car;
import com.nachogl1.reviewingpatterns.creational.factoryMethod.example.someEntities.ElectricCar;

public class ElectricCarFactory extends  CarFactory{
    @Override
    protected Car createCar() {
        return new ElectricCar();
    }
}
