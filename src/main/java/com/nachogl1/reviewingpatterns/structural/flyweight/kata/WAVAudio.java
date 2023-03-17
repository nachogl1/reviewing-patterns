package com.nachogl1.reviewingpatterns.structural.flyweight.kata;

public class WAVAudio extends AudioResources {
    public WAVAudio(byte[] audioData) {
        super(audioData);
    }

    @Override
    public void play() {
        System.out.println("WAVAudio Playing: " + super.bytes);
    }
}
