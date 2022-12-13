package com.nachogl1.reviewingpatterns.structural.proxy;

public class ProxyImage implements Image {
    private String filepath;
    private RealImage realImage;

    public ProxyImage(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void display() {
        if (this.realImage == null) {
            realImage = new RealImage(filepath);
        }

        realImage.display();
    }


}
