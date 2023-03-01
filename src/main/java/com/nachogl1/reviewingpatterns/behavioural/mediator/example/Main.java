package com.nachogl1.reviewingpatterns.behavioural.mediator.example;

import com.nachogl1.reviewingpatterns.behavioural.mediator.example.mediator.GroupChatRoomMediator;
import com.nachogl1.reviewingpatterns.behavioural.mediator.example.participants.User;

public class Main {
    public static void main(String[] args) {
        GroupChatRoomMediator room = new GroupChatRoomMediator();

        User u1 = new User("U1", room);
        User u2 = new User("U2", room);
        User u3 = new User("U3", room);
        User u4 = new User("U4", room);

        u1.send("Halo");
        u2.send("Do you guys want to play a football match tomorrow?");
    }
}
