package com.nachogl1.reviewingpatterns.structural.composite.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptanceTests {

    @Test
    void givenOneBoxWithTwoBoxesInIt_WhenNestedBoxesHave2DifferentItemsEach_ThenItReturnCorrectPrice() {

        Book book1 = new Book("bookName1", 10);
        Book book2 = new Book("bookName2", 20);

        Game game1 = new Game("gameName1", 30);
        Game game2 = new Game("gameName2", 40);

        CompositeItem boxForGames = new CompositeBox(book1, book2);
        CompositeItem boxForBooks = new CompositeBox(game1, game2);

        CompositeItem box = new CompositeBox(boxForBooks, boxForGames);

        int resultPrice = box.calculatePrice();

        assertEquals(100, resultPrice);
    }

    @Test
    void givenOneBoxWithTwoBoxesInIt_WhenNestedBoxesHave2DifferentItemsEach_ThenItReturnCorrectName() {

        Book book1 = new Book("bookName1", 10);
        Book book2 = new Book("bookName2", 20);

        Game game1 = new Game("gameName1", 30);
        Game game2 = new Game("gameName2", 40);

        CompositeItem boxForGames = new CompositeBox(book1, book2);
        CompositeItem boxForBooks = new CompositeBox(game1, game2);

        CompositeItem box = new CompositeBox(boxForBooks, boxForGames);

        String getResultNames = box.getNameOfItems();

        assertEquals("gameName1, gameName2, bookName1, bookName2", getResultNames);
    }

}
