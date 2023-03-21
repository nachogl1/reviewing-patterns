package com.nachogl1.reviewingpatterns.structural.adapter.kata;

public interface OldDbSystemContract {
    void addProduct(String name, int quantity);

    int getQuantity(String name);
}
