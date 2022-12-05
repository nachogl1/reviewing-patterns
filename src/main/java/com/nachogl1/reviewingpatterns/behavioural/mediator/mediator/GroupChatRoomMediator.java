package com.nachogl1.reviewingpatterns.behavioural.mediator.mediator;

import com.nachogl1.reviewingpatterns.behavioural.mediator.participants.Participant;

import java.util.ArrayList;
import java.util.List;

public class GroupChatRoomMediator implements Mediator {

    private List<Participant> participants = new ArrayList<>();

    public void addParticipant(Participant participant) {
        this.participants.add(participant);
    }

    @Override
    public void sendGroupMessage(String message, Participant inputParticipant) {
        this.participants
                .stream()
                .filter(targetParticipant -> isNotSameParticipant(inputParticipant, targetParticipant))
                .forEach(targetParticipant -> targetParticipant.notify(message, inputParticipant));

    }

    private boolean isNotSameParticipant(Participant inputParticipant, Participant targetParticipant) {
        return !targetParticipant.getName().equals(inputParticipant.getName());
    }
}
