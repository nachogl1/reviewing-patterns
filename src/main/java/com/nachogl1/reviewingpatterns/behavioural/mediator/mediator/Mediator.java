package com.nachogl1.reviewingpatterns.behavioural.mediator.mediator;

import com.nachogl1.reviewingpatterns.behavioural.mediator.participants.Participant;

public interface Mediator {
    void sendGroupMessage(String message, Participant participant);
    void addParticipant(Participant participant);
}
