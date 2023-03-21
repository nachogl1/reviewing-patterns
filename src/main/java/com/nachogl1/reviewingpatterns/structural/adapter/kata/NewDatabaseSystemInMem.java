package com.nachogl1.reviewingpatterns.structural.adapter.kata;

import java.util.HashMap;
import java.util.Map;

public class NewDatabaseSystemInMem implements NewDatabase {
    private final Map<String, ProductRecord> products = new HashMap<>();

    public void insert(ProductRecord product) {
        products.put(product.name(), product);
    }

    public ProductRecord findByName(String name) {
        return products.get(name);
    }
}
