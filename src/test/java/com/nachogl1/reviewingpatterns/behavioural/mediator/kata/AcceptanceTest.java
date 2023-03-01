package com.nachogl1.reviewingpatterns.behavioural.mediator.kata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class AcceptanceTest {

    @Test
    void user1MessagesUser2and3Successfully() {
        Participant user1 = new Participant("1");
        Participant user2 = mock(Participant.class);
        Participant user3 = mock(Participant.class);
        Participant user4 = mock(Participant.class);

        Mediator chatRoom = new ChatRoom();
        chatRoom.addParticipant(user1);
        chatRoom.addParticipant(user2);
        chatRoom.addParticipant(user3);

        user1.sendMessage("Hello");

        verify(user2).deliver("Hello", user1);
        verify(user3).deliver("Hello", user1);
        verifyNoInteractions(user4);
    }
}
