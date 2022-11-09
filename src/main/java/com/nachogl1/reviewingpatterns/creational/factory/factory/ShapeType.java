package com.nachogl1.reviewingpatterns.creational.factory.factory;

public enum ShapeType {

    CIRCLE("CIRCLE"), SQUARE("SQUARE");

    private final String type;

    ShapeType(String type) {
        this.type = type;
    }
}
