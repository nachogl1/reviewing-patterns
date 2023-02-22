package com.nachogl1.reviewingpatterns.behavioural.templatePattern.example;

public class FifaGame extends Game {
    private static final String GAME_NAME = "FIFA";

    @Override
    protected void endSession() {
        System.out.println("Finishing match of " + GAME_NAME);
    }

    @Override
    protected void startSession() {
        System.out.println("Starting match of " + GAME_NAME);
    }

    @Override
    protected void initGame() {
        System.out.println("Init data for players of " + GAME_NAME);
    }
}
