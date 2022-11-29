package com.nachogl1.reviewingpatterns.behavioural.observer.observers;

import com.nachogl1.reviewingpatterns.behavioural.observer.toObserve.SubjectToObserved;

public abstract class Observer {
    protected SubjectToObserved subject;
    public abstract void update(String message);
}
