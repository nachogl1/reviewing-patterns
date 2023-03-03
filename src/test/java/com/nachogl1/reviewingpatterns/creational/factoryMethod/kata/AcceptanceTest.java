package com.nachogl1.reviewingpatterns.creational.factoryMethod.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptanceTest {

    @Test
    void createCar() {
        Vehicle expectedVehicle = new Car("Tesla", "Model S", 2022);
        Vehicle resultVehicle = new CarFactory().createCar("Tesla", "Model S", 2022);
        assertEquals(expectedVehicle, resultVehicle);
    }


    @Test
    void createMotorbike() {
        Vehicle expectedVehicle = new MotorBike("Kawasaki", "Ninja", 2022);
        Vehicle resultVehicle = new MotorbikeFactory().createCar("Kawasaki", "Ninja", 2022);
        assertEquals(expectedVehicle, resultVehicle);
    }
}
