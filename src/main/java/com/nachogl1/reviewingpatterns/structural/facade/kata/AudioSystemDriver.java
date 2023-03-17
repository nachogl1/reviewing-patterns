package com.nachogl1.reviewingpatterns.structural.facade.kata;

public abstract class AudioSystemDriver extends Driver {
    public static final DriverType DRIVER_TYPE = DriverType.AUDIO;

    public void setVolumeTo(int volume) {
        System.out.println("Setting volume to " + volume);
    }
}
