package com.nachogl1.reviewingpatterns.creational.factory.factory;

import com.nachogl1.reviewingpatterns.creational.factory.entities.CircleShape;
import com.nachogl1.reviewingpatterns.creational.factory.entities.Shape;
import com.nachogl1.reviewingpatterns.creational.factory.entities.SquareShape;

import java.util.NoSuchElementException;

public class ShapeFactory {

    public static Shape make(ShapeType type) {
        return switch (type) {
            case CIRCLE -> new CircleShape();
            case SQUARE -> new SquareShape();
            default -> throw new NoSuchElementException();
        };
    }


}
