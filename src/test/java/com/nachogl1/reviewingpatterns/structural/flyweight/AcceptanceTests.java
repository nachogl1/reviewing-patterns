package com.nachogl1.reviewingpatterns.structural.flyweight;

import com.nachogl1.reviewingpatterns.structural.flyweight.kata.AudioResourceManager;
import com.nachogl1.reviewingpatterns.structural.flyweight.kata.AudioType;
import com.nachogl1.reviewingpatterns.structural.flyweight.kata.MP4AudioResource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AcceptanceTests {
    private static final int SIZE = 100000000;
    private Stream<byte[]> testAudioBytes = Collections
            .nCopies(SIZE, new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09,
                    0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x00, 0x01, 0x02,
                    0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x00, 0x01, 0x02, 0x03, 0x04, 0x05,
                    0x06, 0x07, 0x08, 0x09}).stream();

    @Test
    void givenNoFlyweightPattern_WhenGettingTheLoadsOfResources_ThenOutOfMemoryError() {
        Assertions.assertThrows(OutOfMemoryError.class, () -> {
            testAudioBytes.map(MP4AudioResource::new).collect(Collectors.toList());
        });
    }

    @Test
    void givenFlyweightPattern_WhenGettingTheLoadsOfResources_ThenTheSystemCanTackleIt() {
        Assertions.assertDoesNotThrow(() -> {
            AudioResourceManager manager = new AudioResourceManager();
            testAudioBytes.map(bytes -> manager.getAudio(AudioType.MP4, bytes)).collect(Collectors.toList());

        });
    }
}
