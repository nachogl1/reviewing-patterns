package com.nachogl1.reviewingpatterns.behavioural.mediator.kata;

import java.util.Objects;
import java.util.UUID;

public class Participant {
    private final String Id = UUID.randomUUID().toString();
    private final String name;
    private Mediator chatRoom;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addChatRoom(Mediator chatRoom) {
        this.chatRoom = chatRoom;
    }

    public void deliver(String message, Participant author) {
        System.out.println(String.format("User %s received following message from %s: %s", name, author.getName(), message));
    }

    public void sendMessage(String message) {
        chatRoom.notifyAll(message, this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(Id, that.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
