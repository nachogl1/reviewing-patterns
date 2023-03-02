package com.nachogl1.reviewingpatterns.creational.factory.kata;

import java.util.Objects;

public class Car {
    protected final String brand;
    protected final String model;
    protected final int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    //equals/hashCode designed for the classes with no changes. If this is left this way, it can bring potential
    //problems when sorting and searching. This has been doing with a few assumptions.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }
}
