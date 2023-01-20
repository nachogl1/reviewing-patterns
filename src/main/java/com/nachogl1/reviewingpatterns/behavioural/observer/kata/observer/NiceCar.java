package com.nachogl1.reviewingpatterns.behavioural.observer.kata.observer;

import com.nachogl1.reviewingpatterns.behavioural.observer.kata.observable.Observable;
import com.nachogl1.reviewingpatterns.behavioural.observer.kata.observer.display.Display;

public class NiceCar extends Car {
    public NiceCar(Observable subject, Display display) {
        super(subject, display);
    }

    @Override
    protected String getCarType() {
        return "NiceCar";
    }
}
