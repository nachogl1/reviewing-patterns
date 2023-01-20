package com.nachogl1.reviewingpatterns.behavioural.observer.example.observers;

import com.nachogl1.reviewingpatterns.behavioural.observer.example.toObserve.SubjectToObserved;

import java.util.UUID;

public class User extends Observer {

    private UUID userId;

    public User(SubjectToObserved subject) {
        userId = UUID.randomUUID();
        super.subject = subject;
        super.subject.addObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println(String.format("User %s received the following message %s", this.userId, message));
    }
}
