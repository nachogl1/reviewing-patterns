package com.nachogl1.reviewingpatterns.structural.decorator;

public class ThickBase extends Pizza{

    @Override
    public String name() {
        return "Thick base";
    }

    @Override
    public int costs() {
        return 10;
    }
}
