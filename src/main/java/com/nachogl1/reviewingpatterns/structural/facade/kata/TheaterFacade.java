package com.nachogl1.reviewingpatterns.structural.facade.kata;

import java.util.Map;
import java.util.Optional;

public class TheaterFacade {

    private final Map<DriverType, Driver> drivers;

    public TheaterFacade(DVDDriver dvdDriver, ScreenDriver screenDriver, AudioSystemDriver audioDriver) {
        this.drivers = Map.of(DVDDriver.DRIVER_TYPE, dvdDriver,
                ScreenDriver.DRIVER_TYPE, screenDriver,
                AudioSystemDriver.DRIVER_TYPE, audioDriver);
    }

    public void turnOnSetUp() {
        this.drivers.forEach((s, driver) -> driver.turnOn());
    }

    public void turnOffSetUp() {
        this.drivers.forEach((s, driver) -> driver.turnOff());
    }

    public void stopResource(DriverType type) {
        this.drivers.get(type).stop();
    }

    public void resumeResource(DriverType type) {
        this.drivers.get(type).resume();
    }

    //I could probably use functional interfaces here
    public void playMovie(String movieName) {
        Optional<DVDDriver> driverOptional = Optional.of((DVDDriver) this.drivers.get(DriverType.DVD));
        driverOptional.ifPresentOrElse(driver -> driver.playMovie(movieName),
                () -> {
                    throw new RuntimeException("Driver not present");
                });
    }

    public void adjustVolume(int volume) {
        Optional<AudioSystemDriver> driverOptional = Optional.of((AudioSystemDriver) this.drivers.get(DriverType.AUDIO));
        driverOptional.ifPresentOrElse(driver -> driver.setVolumeTo(volume),
                () -> {
                    throw new RuntimeException("Driver not present");
                });
    }
}
