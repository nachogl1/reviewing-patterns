package com.nachogl1.reviewingpatterns.structural.bridge.kata;

public class CompleteView extends View {
    public CompleteView(Resource resource) {
        super(resource);
    }

    @Override
    public String getDisplay() {
        return resource.getName() + " - " + resource.getDescription() + " created in " + resource.getYear();
    }
}
