package com.nachogl1.reviewingpatterns.creational.abstractFactory;

import com.nachogl1.reviewingpatterns.creational.abstractFactory.factories.FurnitureFactory;
import com.nachogl1.reviewingpatterns.creational.abstractFactory.factories.ModernStyleFurnitureFactory;
import com.nachogl1.reviewingpatterns.creational.abstractFactory.factories.VictorianStyleFurnitureFactory;

public class FurnitureFactoryManager {
    public static FurnitureFactory getVictorianStyleFurnitureFactory(){
        return new VictorianStyleFurnitureFactory();
    }

    public static FurnitureFactory getModernStyleFurnitureFactory(){
        return new ModernStyleFurnitureFactory();
    }
}
