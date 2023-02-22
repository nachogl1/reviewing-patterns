package com.nachogl1.reviewingpatterns.behavioural.templatePattern.kata;

public class HardBenchPressModule extends Training {

    public HardBenchPressModule(Display display) {
        super(display);
    }

    @Override
    protected String doWarmUp() {
        return "Warm up difficulty level hard";
    }

    @Override
    protected String doEffectiveSets() {
        return "Effective sets difficulty level hard";
    }

    @Override
    protected String doStretching() {
        return "Stretching difficulty level hard";
    }
}
