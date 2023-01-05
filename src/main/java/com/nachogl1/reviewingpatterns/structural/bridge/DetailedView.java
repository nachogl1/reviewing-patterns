package com.nachogl1.reviewingpatterns.structural.bridge;

public class DetailedView extends ViewStyle {
    public DetailedView(Resource resource) {
        super(resource);
    }

    @Override
    public void show() {
        System.out.println(resource.getTitle());
        System.out.println("Image ref: " + resource.getImage());
    }
}
