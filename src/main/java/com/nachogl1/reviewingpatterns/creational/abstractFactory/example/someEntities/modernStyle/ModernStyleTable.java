package com.nachogl1.reviewingpatterns.creational.abstractFactory.example.someEntities.modernStyle;

import com.nachogl1.reviewingpatterns.creational.abstractFactory.example.someEntities.Furniture;

public class ModernStyleTable implements Furniture {
    @Override
    public void getName() {
        System.out.println("I am a Modern Table");
    }

}
