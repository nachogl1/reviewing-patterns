package com.nachogl1.reviewingpatterns.behavioural.templatePattern;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
    Game[] array = new Game[] { new TekenGame(), new FifaGame(), new StreetFightGame() };
    List<Game> games = Arrays.asList(array);

        games.forEach(game->{
            game.play();
        });
    }

}
