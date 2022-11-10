package com.nachogl1.reviewingpatterns.creational.abstractFactory.someEntities.victorianStyle;

import com.nachogl1.reviewingpatterns.creational.abstractFactory.someEntities.Furniture;

public class VictorianStyleChair implements Furniture {
    @Override
    public void getName() {
        System.out.println("I am a Victorian Chair");
    }

}
