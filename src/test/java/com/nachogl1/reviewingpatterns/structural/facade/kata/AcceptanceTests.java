package com.nachogl1.reviewingpatterns.structural.facade.kata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AcceptanceTests {
    @Test
    void givenResourcesNeedUsing_WhenUsingFacadePattern_TheyOperateCorrectly() {
        final String testMovie = "Clean Coder";

        DVDDriver dvdDriverMock = mock(DVDDriver.class);
        ScreenDriver screenDriverMock = mock(ScreenDriver.class);
        AudioSystemDriver audioSystemMock = mock(AudioSystemDriver.class);
        TheaterFacade mainControl = new TheaterFacade(dvdDriverMock, screenDriverMock, audioSystemMock);

        mainControl.turnOnSetUp();
        mainControl.playMovie(testMovie);
        mainControl.adjustVolume(75);
        mainControl.stopResource(DriverType.DVD);
        mainControl.resumeResource(DriverType.DVD);
        mainControl.turnOffSetUp();

        verify(dvdDriverMock).turnOn();
        verify(screenDriverMock).turnOn();
        verify(audioSystemMock).turnOn();
        verify(dvdDriverMock).playMovie(testMovie);
        verify(audioSystemMock).setVolumeTo(75);
        verify(dvdDriverMock).stop();
        verify(dvdDriverMock).resume();

        verify(dvdDriverMock).turnOff();
        verify(screenDriverMock).turnOff();
        verify(audioSystemMock).turnOff();

    }
}
