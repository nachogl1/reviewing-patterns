package com.nachogl1.reviewingpatterns.behavioural.observer.example.toObserve;

import com.nachogl1.reviewingpatterns.behavioural.observer.example.observers.Observer;

public class SansburyShop extends SubjectToObserved {


    public void addObserver(Observer newObserver) {
        super.observers.add(newObserver);
    }

    public void updateAll(String message) {
        observers.forEach(observer -> observer.update(message));
    }

}
