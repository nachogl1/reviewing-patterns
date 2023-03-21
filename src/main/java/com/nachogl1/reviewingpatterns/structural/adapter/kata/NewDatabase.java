package com.nachogl1.reviewingpatterns.structural.adapter.kata;

public interface NewDatabase {

    void insert(ProductRecord product);

    ProductRecord findByName(String name);
}
