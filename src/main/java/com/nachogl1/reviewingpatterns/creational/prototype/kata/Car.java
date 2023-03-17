package com.nachogl1.reviewingpatterns.creational.prototype.kata;

public final class Car extends ClonableVehicle {

    public Car(String brand, String model, int year, int numberOfSeats) {
        super(brand, model, year, numberOfSeats);
    }

    public Car(Car car) {
        this(car.getBrand(), car.getModel(), car.getYear(), car.getNumberOfSeats());
    }

    @Override
    public ClonableVehicle clone() {
        return new Car(this);
    }

}
