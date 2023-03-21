package com.nachogl1.reviewingpatterns.structural.composite.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box {
    private final List<Box> children = new ArrayList<>();

    public CompositeBox(Box... boxes) {
        children.addAll(Arrays.asList(boxes));
    }

    public int calculatePrice() {
        return children
                .stream().mapToInt(Box::calculatePrice)
                .sum();
    }
}
