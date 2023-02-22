package com.nachogl1.reviewingpatterns.behavioural.templatePattern.kata;

public abstract class Training {

    private final Display display;

    public Training(Display display) {
        this.display = display;
    }

    public void training() {
        this.display.show(doWarmUp());
        this.display.show(doEffectiveSets());
        this.display.show(doStretching());
    }

    protected abstract String doWarmUp();

    protected abstract String doEffectiveSets();

    protected abstract String doStretching();

}
