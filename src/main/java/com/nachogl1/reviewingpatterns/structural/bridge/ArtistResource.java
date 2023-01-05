package com.nachogl1.reviewingpatterns.structural.bridge;

public class ArtistResource implements Resource {
    private final Artist artist;

    public ArtistResource(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String getTitle() {
        return artist.getName();
    }

    @Override
    public String getSnippet() {
        return artist.getBio();
    }

    @Override
    public String getUrl() {
        return artist.getUrl();
    }

    @Override
    public byte[] getImage() {
        return artist.getImage();
    }
}
