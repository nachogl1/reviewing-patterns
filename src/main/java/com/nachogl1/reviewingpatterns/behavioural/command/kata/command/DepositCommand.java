package com.nachogl1.reviewingpatterns.behavioural.command.kata.command;

import java.time.LocalDate;

public class DepositCommand extends Command {


    public DepositCommand(int amount, LocalDate date) {
        super(amount, date);
    }

    @Override
    public int executeOn(int currentBalance) {
        return Math.addExact(currentBalance, amount);
    }
}
