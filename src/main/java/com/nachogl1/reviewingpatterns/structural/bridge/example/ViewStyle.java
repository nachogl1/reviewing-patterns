package com.nachogl1.reviewingpatterns.structural.bridge.example;

public abstract class ViewStyle {
    protected Resource resource;

    public ViewStyle(Resource resource) {
        this.resource = resource;
    }

    public abstract void show();
}
