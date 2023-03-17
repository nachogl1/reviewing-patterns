package com.nachogl1.reviewingpatterns.structural.flyweight.example;

import java.util.ArrayList;
import java.util.List;

public class SuccessfulCaseMain {

    private static List<FlyweightBook> books = new ArrayList<>();

    public static void main(String[] args) {
        BookType comedyType = BookTypeFactory.getBookType("Comedy-USA", "USA-Books", "Rare, Long");
        long startTime;
        long endTime;

        for (int i = 0; i < 10000000; i++) {
            FlyweightBook book = new FlyweightBook("defaultname", 10, comedyType);
            books.add(book);
        }

        startTime = System.currentTimeMillis();

        for (FlyweightBook book : books) {
            System.out.println(book);
        }
        endTime = System.currentTimeMillis();


        System.out.println("END, it took " + (endTime - startTime)/1000 + " seconds");

    }
}
