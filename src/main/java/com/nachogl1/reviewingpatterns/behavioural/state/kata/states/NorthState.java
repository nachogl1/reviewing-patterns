package com.nachogl1.reviewingpatterns.behavioural.state.kata.states;

public class NorthState implements DirectionState {

    private static final String NAME = "NORTH";

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public DirectionState turnRight() {
        return new EastState();
    }

    @Override
    public DirectionState turnLeft() {
        return new WestState();
    }

}
