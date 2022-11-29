package com.nachogl1.reviewingpatterns.behavioural.observer.toObserve;

import com.nachogl1.reviewingpatterns.behavioural.observer.observers.Observer;

import java.util.List;

public class SansburyShop extends SubjectToObserved {


    public void addObserver(Observer newObserver) {
        super.observers.add(newObserver);
    }

    public void updateAll(String message) {
        observers.forEach(observer -> observer.update(message));
    }

}
