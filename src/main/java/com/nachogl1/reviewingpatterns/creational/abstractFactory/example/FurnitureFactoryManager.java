package com.nachogl1.reviewingpatterns.creational.abstractFactory.example;

import com.nachogl1.reviewingpatterns.creational.abstractFactory.example.factories.FurnitureFactory;
import com.nachogl1.reviewingpatterns.creational.abstractFactory.example.factories.ModernStyleFurnitureFactory;
import com.nachogl1.reviewingpatterns.creational.abstractFactory.example.factories.VictorianStyleFurnitureFactory;

public class FurnitureFactoryManager {
    public static FurnitureFactory getVictorianStyleFurnitureFactory(){
        return new VictorianStyleFurnitureFactory();
    }

    public static FurnitureFactory getModernStyleFurnitureFactory(){
        return new ModernStyleFurnitureFactory();
    }
}
