package com.nachogl1.reviewingpatterns.structural.composite;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Book("Halo", 10);
        Box box2 = new Book("HaloBye", 12);
        Box box3 = new Book("Halo3", 15);

        Box box4 = new VideoGame("HaloHalo", 100);
        Box box5 = new VideoGame("HaloHalo2", 60);
        Box box6 = new VideoGame("HaloHalo3", 400);

        CompositeBox booksBox = new CompositeBox(box1, box2, box3);
        CompositeBox gamesBox = new CompositeBox(box4, box5, box6);

        CompositeBox finalBox = new CompositeBox(booksBox,gamesBox);

        System.out.println(finalBox.calculatePrice() + " is the final price");

    }
}
