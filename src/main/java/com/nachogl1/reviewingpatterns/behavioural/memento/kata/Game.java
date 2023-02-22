package com.nachogl1.reviewingpatterns.behavioural.memento.kata;

import java.util.Stack;

import static com.nachogl1.reviewingpatterns.behavioural.memento.kata.Account.*;

public class Game {
    private Stack<Memento> levelHistory = new Stack<>();
    private Account account = new Account();

    public void newLevel(String levelName) {
        levelHistory.add(account.takeSnapshot());
        this.account.setLevel(levelName);
    }

    public void levelDown() {
        account.restore(levelHistory.pop());
    }

    public String getLevel() {
        return account.getLevelName();
    }
}
