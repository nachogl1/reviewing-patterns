package com.nachogl1.reviewingpatterns.structural.flyweight.kata;

public class MP4AudioResource extends AudioResources {
    public MP4AudioResource(byte[] audioData) {
        super(audioData);
    }

    @Override
    public void play() {
        System.out.println("MP4 Playing: " + super.bytes);
    }
}
