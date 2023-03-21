package com.nachogl1.reviewingpatterns.structural.bridge.kata;

public class Artist extends Resource {
    public Artist(String name, String description, int year, byte[] image) {
        super(name, description, year, image);
    }
}
