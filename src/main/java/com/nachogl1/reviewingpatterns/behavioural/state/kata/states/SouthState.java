package com.nachogl1.reviewingpatterns.behavioural.state.kata.states;

public class SouthState implements DirectionState{
    private static final String NAME = "SOUTH";

    @Override
    public String name() {
        return NAME;
    }


    @Override
    public DirectionState turnRight() {
        return new WestState();
    }

    @Override
    public DirectionState turnLeft() {
        return new EastState();
    }
}
