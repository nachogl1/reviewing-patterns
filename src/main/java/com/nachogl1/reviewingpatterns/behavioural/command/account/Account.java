package com.nachogl1.reviewingpatterns.behavioural.command.account;

public abstract class Account {
    protected int amount;
    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);
    public void showMeTheMoney(){
        System.out.println(this.amount);
    }
}
