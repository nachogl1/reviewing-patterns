package com.nachogl1.reviewingpatterns.creational.abstractFactory.factories;

import com.nachogl1.reviewingpatterns.creational.abstractFactory.someEntities.Furniture;
import com.nachogl1.reviewingpatterns.creational.abstractFactory.someEntities.victorianStyle.VictorianStyleChair;
import com.nachogl1.reviewingpatterns.creational.abstractFactory.someEntities.victorianStyle.VictorianStyleTable;

public class VictorianStyleFurnitureFactory extends FurnitureFactory{
    @Override
    public Furniture makeChair() {
        return new VictorianStyleChair();
    }

    @Override
    public Furniture makeTable() {
        return new VictorianStyleTable();
    }
}
