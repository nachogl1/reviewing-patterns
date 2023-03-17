package com.nachogl1.reviewingpatterns.structural.flyweight.kata;

public abstract class AudioResources {

    protected final byte[] bytes;

    public AudioResources(byte[] bytes) {
        this.bytes = bytes;
    }

    public abstract void play();
}
