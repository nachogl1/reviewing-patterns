package com.nachogl1.reviewingpatterns.structural.flyweight.kata;

import java.util.HashMap;
import java.util.Map;

public class AudioResourceManager {
    private Map<AudioType, AudioResources> audioMap = new HashMap<>();

    public AudioResources getAudio(AudioType type, byte[] audioData) {
        AudioResources audio = audioMap.get(type);

        if (audio == null) {
            audio = switch (type) {
                case MP4 -> new MP4AudioResource(audioData);
                case WAV -> new WAVAudio(audioData);
            };

            audioMap.put(type, audio);
        }

        return audio;
    }
}
