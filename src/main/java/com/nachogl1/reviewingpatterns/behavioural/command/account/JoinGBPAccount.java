package com.nachogl1.reviewingpatterns.behavioural.command.account;

import java.util.List;

public class JoinGBPAccount extends Account {

    private List<Customer> customers;

    public JoinGBPAccount(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public void deposit(int amount) {
            super.amount += amount;
    }

    @Override
    public void withdraw(int amount) {
        super.amount -= amount;

    }

}
