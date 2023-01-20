package com.nachogl1.reviewingpatterns.behavioural.observer.kata.observer;


import com.nachogl1.reviewingpatterns.behavioural.observer.kata.observable.Observable;

public abstract class Observer {
    protected Observable subject;

    public Observer(Observable subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    public abstract void update(String message);
}
