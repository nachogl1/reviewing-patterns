package com.nachogl1.reviewingpatterns.behavioural.state.kata;

import com.nachogl1.reviewingpatterns.behavioural.state.kata.states.DirectionState;
import com.nachogl1.reviewingpatterns.behavioural.state.kata.states.NorthState;

public class CoolRover {
    private DirectionState currentDirection = new NorthState();

    public void turnRight() {
        this.currentDirection = this.currentDirection.turnRight();
    }

    public void turnLeft() {
        this.currentDirection = this.currentDirection.turnLeft();
    }

    public String getDirectionName() {
        return this.currentDirection.name();
    }
}
