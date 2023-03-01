package com.nachogl1.reviewingpatterns.behavioural.mediator.example.mediator;

import com.nachogl1.reviewingpatterns.behavioural.mediator.example.participants.Participant;

public interface Mediator {
    void sendGroupMessage(String message, Participant participant);
    void addParticipant(Participant participant);
}
