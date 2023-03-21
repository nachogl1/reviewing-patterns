package com.nachogl1.reviewingpatterns.structural.bridge.example;

public class Artist {

    private final String name;
    private final String bio;
    private final String url;
    private final byte[] image;

    public Artist(String name, String bio, String url, byte[] image) {
        this.name = name;
        this.bio = bio;
        this.url = url;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public String getUrl() {
        return url;

    }

    public byte[] getImage() {
        return image;
    }
}
