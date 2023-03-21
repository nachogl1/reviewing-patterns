package com.nachogl1.reviewingpatterns.structural.bridge.example;

public class PopUpView extends ViewStyle {
    public PopUpView(Resource resource) {
        super(resource);
    }

    @Override
    public void show() {
        System.out.println(resource.getTitle());
    }
}
