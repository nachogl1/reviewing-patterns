package com.nachogl1.reviewingpatterns.creational.factory.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AcceptanceTest {

    @Test
    void createHondaCivicUsingFactory() {

        Car expectedCar = new HondaCar("Civic", 2020);
        Car honda = CarFactory.createHondaCar("Civic", 2020);
        Assertions.assertEquals(expectedCar, honda);

    }
}
