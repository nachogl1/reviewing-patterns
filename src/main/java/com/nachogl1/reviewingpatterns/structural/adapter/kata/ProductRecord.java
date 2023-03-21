package com.nachogl1.reviewingpatterns.structural.adapter.kata;

public record ProductRecord(String name, int quantity) {
    @Override
    public String name() {
        return name;
    }

    @Override
    public int quantity() {
        return quantity;
    }
}

