package com.nachogl1.reviewingpatterns.structural.bridge;

public interface Resource {
    String getTitle();

    String getSnippet();

    String getUrl();

    byte[] getImage();
}
