package com.nachogl1.reviewingpatterns.structural.proxy.example;

public class RealImage implements Image {
    private String filepath;

    public RealImage(String filepath) {
        this.filepath = filepath;
        this.loadFromDisk(filepath);
    }

    @Override
    public void display() {
        System.out.println("Displaying image in path: " + this.filepath);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Loading from disk image placed at: " + this.filepath);
    }
}
