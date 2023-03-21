package com.nachogl1.reviewingpatterns.behavioural.command.kata.example.command;

import com.nachogl1.reviewingpatterns.behavioural.command.kata.example.account.Account;

public class Withdraw implements Command {
    private int amount;
    private Account account;

    public Withdraw(int amount, Account account) {
        this.amount = amount;
        this.account = account;
    }

    @Override
    public void execute() {
        System.out.println("Executing " + amount + " withdrawal for account " + account);
        this.account.withdraw(this.amount);
    }
}

