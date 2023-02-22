package com.nachogl1.reviewingpatterns.behavioural.memento.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoolGameShould {
    @Test
    void startingFromGroundLevelIncrease3MoreAndUndoCorrectly(){
        Game game = new Game();

        game.newLevel("mid Level");
        game.newLevel("hard Level");
        game.newLevel("ultimate Level");

        Assertions.assertEquals(game.getLevel(), "ultimate Level");
        game.levelDown();
        Assertions.assertEquals(game.getLevel(), "hard Level");
        game.levelDown();
        Assertions.assertEquals(game.getLevel(), "mid Level");
        game.levelDown();
        Assertions.assertEquals(game.getLevel(), "Ground Level");
    }
}
