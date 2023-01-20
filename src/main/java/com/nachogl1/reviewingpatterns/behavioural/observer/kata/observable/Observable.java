package com.nachogl1.reviewingpatterns.behavioural.observer.kata.observable;


import com.nachogl1.reviewingpatterns.behavioural.observer.kata.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public abstract void addObserver(Observer newObserver);

    public abstract void updateAll(String message);
}
