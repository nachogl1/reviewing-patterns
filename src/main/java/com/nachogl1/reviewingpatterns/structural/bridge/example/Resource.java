package com.nachogl1.reviewingpatterns.structural.bridge.example;

public interface Resource {
    String getTitle();

    String getSnippet();

    String getUrl();

    byte[] getImage();
}
