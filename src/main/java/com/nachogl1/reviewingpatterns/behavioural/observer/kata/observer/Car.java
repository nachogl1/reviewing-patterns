package com.nachogl1.reviewingpatterns.behavioural.observer.kata.observer;

import com.nachogl1.reviewingpatterns.behavioural.observer.kata.observable.Observable;
import com.nachogl1.reviewingpatterns.behavioural.observer.kata.observer.display.Display;

import static java.lang.String.format;

public abstract class Car extends Observer {

    protected Display display;

    public Car(Observable subject, Display display) {
        super(subject);
        this.display = display;
    }

    public void update(String message) {
        this.display.display(format("Car %s received new update %s", getCarType(), message));
    }

    protected abstract String getCarType();

}
