package com.nachogl1.reviewingpatterns.creational.abstractFactory.example.someEntities.victorianStyle;

import com.nachogl1.reviewingpatterns.creational.abstractFactory.example.someEntities.Furniture;

public class VictorianStyleChair implements Furniture {
    @Override
    public void getName() {
        System.out.println("I am a Victorian Chair");
    }

}
