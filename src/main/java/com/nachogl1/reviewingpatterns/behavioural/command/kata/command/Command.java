package com.nachogl1.reviewingpatterns.behavioural.command.kata.command;

public abstract class Command {
    protected final int amount;

    public Command(int amount) {
        this.amount = amount;
    }

    public abstract int executeOn(int currentBalance);
}
