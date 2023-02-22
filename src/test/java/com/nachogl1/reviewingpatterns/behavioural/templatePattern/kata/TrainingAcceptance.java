package com.nachogl1.reviewingpatterns.behavioural.templatePattern.kata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TrainingAcceptance {

    @Test
    void beginnerBenchPressModuleCorrectContent() {
        Display displayMock = mock(Display.class);
        Training training = new BeginnerBenchPressModule(displayMock);

        training.training();

        verify(displayMock).show("Warm up difficulty level beginner");
        verify(displayMock).show("Effective sets difficulty level beginner");
        verify(displayMock).show("Stretching difficulty level beginner");

    }

    @Test
    void midBenchPressModuleCorrectContent() {
        Display displayMock = mock(Display.class);
        Training training = new MidBenchPressModule(displayMock);

        training.training();

        verify(displayMock).show("Warm up difficulty level mid");
        verify(displayMock).show("Effective sets difficulty level mid");
        verify(displayMock).show("Stretching difficulty level mid");
    }

    @Test
    void hardBenchPressModuleCorrectContent() {
        Display displayMock = mock(Display.class);
        Training training = new HardBenchPressModule(displayMock);

        training.training();

        verify(displayMock).show("Warm up difficulty level hard");
        verify(displayMock).show("Effective sets difficulty level hard");
        verify(displayMock).show("Stretching difficulty level hard");

    }
}
