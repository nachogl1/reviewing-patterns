package com.nachogl1.reviewingpatterns.behavioural.observer.example.observers;

import com.nachogl1.reviewingpatterns.behavioural.observer.example.toObserve.SubjectToObserved;

public abstract class Observer {
    protected SubjectToObserved subject;
    public abstract void update(String message);
}
