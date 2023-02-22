package com.nachogl1.reviewingpatterns.behavioural.templatePattern.example;

public class TekenGame extends Game {
    private static final String GAME_NAME = "TEKEN";

    @Override
    protected void endSession() {
        System.out.println("Finishing game fight of " + GAME_NAME);
    }

    @Override
    protected void startSession() {
        System.out.println("Starting game fight of " + GAME_NAME);
    }

    @Override
    protected void initGame() {
        System.out.println("Init data for players of " + GAME_NAME);
    }
}
