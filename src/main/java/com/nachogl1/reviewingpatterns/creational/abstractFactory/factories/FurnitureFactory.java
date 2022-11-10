package com.nachogl1.reviewingpatterns.creational.abstractFactory.factories;

import com.nachogl1.reviewingpatterns.creational.abstractFactory.someEntities.Furniture;

public abstract class FurnitureFactory {
    public abstract Furniture makeChair();
    public abstract Furniture makeTable();
}
