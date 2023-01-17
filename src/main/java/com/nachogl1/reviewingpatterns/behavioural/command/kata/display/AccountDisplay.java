package com.nachogl1.reviewingpatterns.behavioural.command.kata.display;

public class AccountDisplay implements Display {
    @Override
    public void display(String message) {
        System.out.println(message);
    }
}
