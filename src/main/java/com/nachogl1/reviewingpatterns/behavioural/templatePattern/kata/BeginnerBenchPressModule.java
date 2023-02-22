package com.nachogl1.reviewingpatterns.behavioural.templatePattern.kata;

public class BeginnerBenchPressModule extends Training {
    public BeginnerBenchPressModule(Display display) {
        super(display);
    }

    @Override
    protected String doWarmUp() {
        return "Warm up difficulty level beginner";
    }

    @Override
    protected String doEffectiveSets() {
        return "Effective sets difficulty level beginner";
    }

    @Override
    protected String doStretching() {
        return "Stretching difficulty level beginner";
    }
}
