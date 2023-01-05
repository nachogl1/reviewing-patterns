package com.nachogl1.reviewingpatterns.structural.bridge;

public class BookResource implements Resource{
    private final Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public String getSnippet() {
        return book.getSnippet();
    }

    @Override
    public String getUrl() {
        return book.getUrl();
    }

    @Override
    public byte[] getImage() {
        return book.getImage();
    }
}
