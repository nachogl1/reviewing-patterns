package com.nachogl1.reviewingpatterns.creational.factory.example.factory;

import com.nachogl1.reviewingpatterns.creational.factory.example.entities.CircleShape;
import com.nachogl1.reviewingpatterns.creational.factory.example.entities.Shape;
import com.nachogl1.reviewingpatterns.creational.factory.example.entities.SquareShape;

public class ShapeFactory {

    public static Shape make(ShapeType type) {
        return switch (type) {
            case CIRCLE -> new CircleShape();
            case SQUARE -> new SquareShape();
        };
    }


}
