package com.nachogl1.reviewingpatterns.structural.decorator;

public class ThinBase extends Pizza {

    @Override
    public String name() {
        return "Thick base";
    }

    @Override
    public int costs() {
        return 10;
    }

}
