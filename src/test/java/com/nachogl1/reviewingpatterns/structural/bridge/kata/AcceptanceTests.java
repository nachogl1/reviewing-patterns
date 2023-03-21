package com.nachogl1.reviewingpatterns.structural.bridge.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AcceptanceTests {

    @Test
    void presentArtistResourceUsingSimpleView() {
        Resource artist = new Artist("Pepito Songwriter", "Reggaton Singer for the people", 1995, new byte[]{0x0, 0x1, 0x2});
        View simpleView = new SimpleView(artist);

        String result = simpleView.getDisplay();

        Assertions.assertEquals("Pepito Songwriter - Reggaton Singer for the people", result);
    }

    @Test
    void presentBookResourceUsingSimpleView() {
        Resource book = new Book("The Lazyness", "An story of lazyness", 2020, new byte[]{0x30, 0x31, 0x23});
        View simpleView = new SimpleView(book);

        String result = simpleView.getDisplay();

        Assertions.assertEquals("The Lazyness - An story of lazyness", result);
    }

    @Test
    void presentBookResourceUsingCompleteView() {
        Resource book = new Book("The Lazyness", "An story of lazyness", 2020, new byte[]{0x30, 0x31, 0x23});
        View simpleView = new CompleteView(book);

        String result = simpleView.getDisplay();

        Assertions.assertEquals("The Lazyness - An story of lazyness created in 2020", result);
    }
}
