package com.nachogl1.reviewingpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class WrongCaseMain {

    private static List<BookNoFlyweight> books = new ArrayList<>();

    //Do not run this, it will take load of resources, careful
    public static void main(String[] args) {
        long startTime;
        long endTime;

        for (int i = 0; i < 10000000; i++) {
            BookNoFlyweight book = new BookNoFlyweight("defaultname", 10, "comedy", "USA-Books", "Rare");
            books.add(book);
        }

        startTime = System.currentTimeMillis();
        for (BookNoFlyweight book : books) {
            System.out.println(book);
        }
        endTime = System.currentTimeMillis();


        System.out.println("END, it took " + (endTime - startTime)/1000 + " seconds");

    }
}
