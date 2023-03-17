package com.nachogl1.reviewingpatterns.structural.facade.kata;

public abstract class DVDDriver extends Driver {
    public static final DriverType DRIVER_TYPE = DriverType.DVD;

    abstract void playMovie(String movieName);
}
