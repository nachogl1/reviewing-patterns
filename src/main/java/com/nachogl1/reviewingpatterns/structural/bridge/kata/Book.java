package com.nachogl1.reviewingpatterns.structural.bridge.kata;

public class Book extends Resource {
    public Book(String name, String description, int year, byte[] image) {
        super(name, description, year, image);
    }
}
