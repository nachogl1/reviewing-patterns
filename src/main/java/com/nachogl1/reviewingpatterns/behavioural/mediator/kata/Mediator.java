package com.nachogl1.reviewingpatterns.behavioural.mediator.kata;

public interface Mediator {

    void addParticipant(Participant newParticipant);

    void notifyAll(String message, Participant author);
}
