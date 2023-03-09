package com.nachogl1.reviewingpatterns.creational.abstractFactory.example.factories;

import com.nachogl1.reviewingpatterns.creational.abstractFactory.example.someEntities.Furniture;
import com.nachogl1.reviewingpatterns.creational.abstractFactory.example.someEntities.victorianStyle.VictorianStyleChair;
import com.nachogl1.reviewingpatterns.creational.abstractFactory.example.someEntities.victorianStyle.VictorianStyleTable;

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
