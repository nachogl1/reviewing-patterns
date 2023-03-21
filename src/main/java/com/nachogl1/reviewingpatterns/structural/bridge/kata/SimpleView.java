package com.nachogl1.reviewingpatterns.structural.bridge.kata;

public class SimpleView extends View {
    public SimpleView(Resource resource) {
        super(resource);
    }

    @Override
    public String getDisplay() {
        return resource.getName() + " - " + resource.getDescription();
    }
}
