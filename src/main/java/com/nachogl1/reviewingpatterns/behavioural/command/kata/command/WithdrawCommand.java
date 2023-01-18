package com.nachogl1.reviewingpatterns.behavioural.command.kata.command;

import java.time.LocalDate;

public class WithdrawCommand extends Command {


    public WithdrawCommand(int amount, LocalDate date) {
        super(amount, date);
    }

    @Override
    public int executeOn(int currentBalance) {
        return Math.subtractExact(currentBalance, amount);
    }
}
