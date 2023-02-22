package com.nachogl1.reviewingpatterns.behavioural.templatePattern.kata;

public class MidBenchPressModule extends Training {
    public MidBenchPressModule(Display display) {
        super(display);
    }

    @Override
    protected String doWarmUp() {
        return "Warm up difficulty level mid";
    }

    @Override
    protected String doEffectiveSets() {
        return "Effective sets difficulty level mid";
    }

    @Override
    protected String doStretching() {
        return "Stretching difficulty level mid";
    }
}