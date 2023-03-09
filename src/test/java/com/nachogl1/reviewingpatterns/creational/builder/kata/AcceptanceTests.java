package com.nachogl1.reviewingpatterns.creational.builder.kata;

import com.nachogl1.reviewingpatterns.creational.builder.kata.Car.CarBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptanceTests {
    @Test
    void givenCarParameters_whenRequestedToFactory_thenItIsCreatedCorrectly() {
        Car car = new CarBuilder().brand("Honda").model("Civic").year(2023).build();

        assertEquals("Honda", car.getBrand());
        assertEquals("Civic", car.getModel());
        assertEquals(2023, car.getYear());
    }
}
