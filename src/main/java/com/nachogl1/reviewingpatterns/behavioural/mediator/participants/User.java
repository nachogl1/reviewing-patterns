package com.nachogl1.reviewingpatterns.behavioural.mediator.participants;

import com.nachogl1.reviewingpatterns.behavioural.mediator.mediator.Mediator;

public class User extends Participant {

    public User(String name, Mediator mediator) {
        super(name, mediator);
        mediator.addParticipant(this);
    }

    @Override
    public void send(String message) {
        mediator.sendGroupMessage(message, this);
    }


}
