package com.nachogl1.reviewingpatterns.behavioural.command.kata.example.account;

public class PersonalGBPAccount extends Account {
    @Override
    public void deposit(int amount) {
        super.amount += amount;
    }

    @Override
    public void withdraw(int amount) {
        super.amount -= amount;

    }
}
