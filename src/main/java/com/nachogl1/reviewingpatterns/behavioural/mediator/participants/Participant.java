package com.nachogl1.reviewingpatterns.behavioural.mediator.participants;

import com.nachogl1.reviewingpatterns.behavioural.mediator.mediator.Mediator;

public abstract class Participant {
    protected final Mediator mediator;
    protected final String name;

    public Participant(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void notify(String message, Participant inputParticipant) {
        System.out.println(String.format("User %s received following message from %s: %s", name, inputParticipant.getName(),message));
    }

    public String getName() {
        return name;
    }

    public abstract void send(String message);
}
