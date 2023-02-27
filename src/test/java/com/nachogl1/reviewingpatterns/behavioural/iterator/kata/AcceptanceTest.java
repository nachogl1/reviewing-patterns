package com.nachogl1.reviewingpatterns.behavioural.iterator.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptanceTest {

    @Test
    void enSaving3BooksYouCanIterate3Books() {
        Book book1 = new Book("title1");
        Book book2 = new Book("title2");
        Book book3 = new Book("title3");

        BookCollection collection = new BookCollection(3);

        collection.add(book1);
        collection.add(book2);
        collection.add(book3);

        BookCollection result = new BookCollection(3);
        Iterator it = collection.getIterator();

        while (it.hasNext()) {
            result.add(it.next());
        }

        assertEquals(3, collection.getSize());

    }

}
