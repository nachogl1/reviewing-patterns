package com.nachogl1.reviewingpatterns.structural.bridge.kata;

public abstract class View {
    protected final Resource resource;

    protected View(Resource resource) {
        this.resource = resource;
    }

    public abstract String getDisplay();
}
