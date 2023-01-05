package com.nachogl1.reviewingpatterns.structural.bridge;

public class Book {

    private final String url;
    private final byte[] image;
    private final String title;
    private final String snippet;

    public Book(String url, byte[] image, String title, String snippet) {
        this.url = url;
        this.image = image;
        this.title = title;
        this.snippet = snippet;
    }

    public byte[] getImage() {
        return image;
    }

    public String getTitle() {

        return title;
    }

    public String getSnippet() {
        return snippet;
    }

    public String getUrl() {
        return url;
    }
}
