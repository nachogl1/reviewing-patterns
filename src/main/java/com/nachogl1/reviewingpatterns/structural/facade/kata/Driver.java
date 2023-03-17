package com.nachogl1.reviewingpatterns.structural.facade.kata;

import java.util.UUID;

public abstract class Driver {

    abstract void turnOn();

    abstract void turnOff();

    public abstract void resume();

    public abstract void stop();
}
