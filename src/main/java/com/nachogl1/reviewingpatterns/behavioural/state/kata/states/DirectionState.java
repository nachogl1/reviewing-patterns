package com.nachogl1.reviewingpatterns.behavioural.state.kata.states;

public interface DirectionState {

    DirectionState turnRight();

    DirectionState turnLeft();

    String name();
}
