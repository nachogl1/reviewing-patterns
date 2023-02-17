package com.nachogl1.reviewingpatterns.behavioural.state.kata.states;

public class EastState implements DirectionState{

    private static final String NAME = "EAST";

    @Override
    public String name() {
        return NAME;
    }


    @Override
    public DirectionState turnRight() {
        return new SouthState();
    }

    @Override
    public DirectionState turnLeft() {
        return new NorthState();
    }
}
