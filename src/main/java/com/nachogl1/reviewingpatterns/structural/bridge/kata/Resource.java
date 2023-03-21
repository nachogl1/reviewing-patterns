package com.nachogl1.reviewingpatterns.structural.bridge.kata;

public abstract class Resource {

    private final String name;
    private final String description;
    private final int year;
    private final byte[] image;

    public Resource(String name, String description, int year, byte[] image) {
        this.name = name;
        this.description = description;
        this.year = year;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public byte[] getImage() {
        return image;
    }
}
