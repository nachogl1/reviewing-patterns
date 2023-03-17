package com.nachogl1.reviewingpatterns.creational.prototype.kata;

import java.util.Objects;

public abstract class ClonableVehicle {

    private final String brand;
    private final String model;
    private final int year;
    private int numberOfSeats;

    public ClonableVehicle(String brand, String model, int year, int numberOfSeats) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.numberOfSeats = numberOfSeats;
    }

    public abstract ClonableVehicle clone();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClonableVehicle that = (ClonableVehicle) o;
        return year == that.year && numberOfSeats == that.numberOfSeats && Objects.equals(brand, that.brand) && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, numberOfSeats);
    }

}
