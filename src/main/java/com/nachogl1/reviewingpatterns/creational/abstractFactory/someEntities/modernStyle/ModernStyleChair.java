package com.nachogl1.reviewingpatterns.creational.abstractFactory.someEntities.modernStyle;

import com.nachogl1.reviewingpatterns.creational.abstractFactory.someEntities.Furniture;

public class ModernStyleChair implements Furniture {
    @Override
    public void getName() {
        System.out.println("I am a Modern Chair");
    }

}
