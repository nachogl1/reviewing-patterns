package com.nachogl1.reviewingpatterns.behavioural.command.kata.command;

public class DepositCommand extends Command {


    public DepositCommand(int amount) {
        super(amount);
    }

    @Override
    public int executeOn(int currentBalance) {
        return Math.addExact(currentBalance, amount);
    }
}
