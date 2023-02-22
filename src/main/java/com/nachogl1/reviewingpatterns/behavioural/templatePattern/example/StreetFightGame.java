package com.nachogl1.reviewingpatterns.behavioural.templatePattern.example;

public class StreetFightGame extends Game {
    private static final String GAME_NAME = "STREET_FIGHT";

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
