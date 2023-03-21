package com.nachogl1.reviewingpatterns.structural.adapter.kata;

public class DBAdapter implements OldDbSystemContract {
    private final NewDatabase newDatabase;

    public DBAdapter(NewDatabaseSystemInMem newDatabase) {
        this.newDatabase = newDatabase;
    }

    @Override
    public void addProduct(String name, int quantity) {
        newDatabase.insert(new ProductRecord(name, quantity));
    }

    @Override
    public int getQuantity(String name) {
        ProductRecord product = newDatabase.findByName(name);
        return product == null ? 0 : product.quantity();
    }
}
