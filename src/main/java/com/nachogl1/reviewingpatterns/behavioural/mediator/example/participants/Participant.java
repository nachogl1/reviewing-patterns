package com.nachogl1.reviewingpatterns.behavioural.mediator.example.participants;

import com.nachogl1.reviewingpatterns.behavioural.mediator.example.mediator.Mediator;

public abstract class Participant {
    protected final Mediator room;
    protected final String name;

    public Participant(String name, Mediator room) {
        this.name = name;
        this.room = room;
    }

    public void notify(String message, Participant inputParticipant) {
        System.out.println(String.format("User %s received following message from %s: %s", name, inputParticipant.getName(),message));
    }

    public String getName() {
        return name;
    }

    public abstract void send(String message);
}
