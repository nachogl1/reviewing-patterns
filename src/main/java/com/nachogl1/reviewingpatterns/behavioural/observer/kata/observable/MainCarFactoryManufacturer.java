package com.nachogl1.reviewingpatterns.behavioural.observer.kata.observable;


import com.nachogl1.reviewingpatterns.behavioural.observer.kata.observer.Observer;

public class MainCarFactoryManufacturer extends Observable {
    @Override
    public void addObserver(Observer newObserver) {
        this.observers.add(newObserver);
    }

    @Override
    public void updateAll(String message) {
        this.observers.forEach(observer -> observer.update(message));
    }
}
