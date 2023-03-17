package com.nachogl1.reviewingpatterns.creational.prototype.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AcceptanceTest {

    @Test
    void cloneCarCorrectly() {
        ClonableVehicle car = new Car("Honda", "Civic", 2023, 4);

        ClonableVehicle carCopy = car.clone();

        Assertions.assertEquals(car, carCopy);
        Assertions.assertNotSame(car, carCopy);

    }

    @Test
    void cloneCarCorrectlyAndThenChangeNumberOfSeatsOfTheCloneTo3() {
        ClonableVehicle car = new Car("Honda", "Civic", 2023, 4);

        ClonableVehicle carCopy = car.clone();
        carCopy.setNumberOfSeats(3);

        Assertions.assertNotEquals(car, carCopy);
        Assertions.assertEquals(3, carCopy.getNumberOfSeats());
        Assertions.assertEquals(4, car.getNumberOfSeats());
        Assertions.assertNotSame(car, carCopy);

    }
}
