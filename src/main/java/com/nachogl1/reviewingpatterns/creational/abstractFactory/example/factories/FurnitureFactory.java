package com.nachogl1.reviewingpatterns.creational.abstractFactory.example.factories;

import com.nachogl1.reviewingpatterns.creational.abstractFactory.example.someEntities.Furniture;

public abstract class FurnitureFactory {
    public abstract Furniture makeChair();
    public abstract Furniture makeTable();
}
