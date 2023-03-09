package com.nachogl1.reviewingpatterns.creational.abstractFactory.example.factories;

import com.nachogl1.reviewingpatterns.creational.abstractFactory.example.someEntities.Furniture;
import com.nachogl1.reviewingpatterns.creational.abstractFactory.example.someEntities.modernStyle.ModernStyleChair;
import com.nachogl1.reviewingpatterns.creational.abstractFactory.example.someEntities.modernStyle.ModernStyleTable;

public class ModernStyleFurnitureFactory extends FurnitureFactory{
    @Override
    public Furniture makeChair() {
        return new ModernStyleChair();
    }

    @Override
    public Furniture makeTable() {
        return new ModernStyleTable();
    }
}
