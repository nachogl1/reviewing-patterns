package com.nachogl1.reviewingpatterns.structural.composite.kata;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompositeBox implements CompositeItem {
    private final List<CompositeItem> children = new ArrayList<>();

    public CompositeBox(CompositeItem... boxes) {
        children.addAll(Arrays.asList(boxes));
    }

    public int calculatePrice() {
        return children
                .stream().mapToInt(CompositeItem::calculatePrice)
                .sum();
    }

    @Override
    public String getNameOfItems() {
        return children.stream().map(CompositeItem::getNameOfItems).collect(Collectors.joining(", "));
    }
}
