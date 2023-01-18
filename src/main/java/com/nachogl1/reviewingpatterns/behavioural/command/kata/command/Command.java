package com.nachogl1.reviewingpatterns.behavioural.command.kata.command;

import java.time.LocalDate;

public abstract class Command {
    protected final int amount;
    protected final LocalDate date;

    public Command(int amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    public abstract int executeOn(int currentBalance);

    public LocalDate getDate() {
        return date;
    }
}
