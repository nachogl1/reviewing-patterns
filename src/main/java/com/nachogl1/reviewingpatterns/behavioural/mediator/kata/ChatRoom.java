package com.nachogl1.reviewingpatterns.behavioural.mediator.kata;

import java.util.HashSet;
import java.util.Set;

public class ChatRoom implements Mediator {
    private final Set<Participant> participants = new HashSet<>();

    @Override
    public void addParticipant(Participant newParticipant) {
        this.participants.add(newParticipant);
        newParticipant.addChatRoom(this);
    }

    @Override
    public void notifyAll(String message, Participant author) {
        this.participants.stream()
                .filter(receiver -> !receiver.equals(author))
                .forEach(receiver -> receiver.deliver(message, author));
    }
}
