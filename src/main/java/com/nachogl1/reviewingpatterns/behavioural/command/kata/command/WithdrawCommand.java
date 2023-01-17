package com.nachogl1.reviewingpatterns.behavioural.command.kata.command;

public class WithdrawCommand extends Command {

    public WithdrawCommand(int amount) {
        super(amount);
    }

    @Override
    public int executeOn(int currentBalance) {
        return Math.subtractExact(currentBalance, amount);
    }
}
