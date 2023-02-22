package com.nachogl1.reviewingpatterns.behavioural.templatePattern.example;

public abstract class Game {
    public void play() {
        initGame();
        startSession();
        endSession();
    }

    protected abstract void endSession();

    protected abstract void startSession();

    protected abstract void initGame();
}
