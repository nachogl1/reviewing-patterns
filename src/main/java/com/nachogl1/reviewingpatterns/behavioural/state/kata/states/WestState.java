package com.nachogl1.reviewingpatterns.behavioural.state.kata.states;

public class WestState implements DirectionState {
    private static final String NAME = "WEST";

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public DirectionState turnRight() {
        return new NorthState();
    }

    @Override
    public DirectionState turnLeft() {
        return new SouthState();
    }
}
