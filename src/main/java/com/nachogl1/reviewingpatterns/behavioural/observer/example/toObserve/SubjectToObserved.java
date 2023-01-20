package com.nachogl1.reviewingpatterns.behavioural.observer.example.toObserve;

import com.nachogl1.reviewingpatterns.behavioural.observer.example.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectToObserved {
    protected List<Observer> observers = new ArrayList<>();

    public abstract void addObserver(Observer newObserver);

    public abstract void updateAll(String message);
}
