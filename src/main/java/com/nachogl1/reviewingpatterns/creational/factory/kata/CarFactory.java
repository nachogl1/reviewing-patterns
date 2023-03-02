package com.nachogl1.reviewingpatterns.creational.factory.kata;

public class CarFactory {
    public static Car create(String manufacturer, String model, int year) {
        return switch (manufacturer) {
            case "Honda" -> new HondaCar(model, year);
            case "Volvo" -> new VolvoCar(model, year);
            default -> throw new IllegalArgumentException(); //avoid by using enums?
        };
    }
}
