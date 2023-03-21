package com.nachogl1.reviewingpatterns.structural.composite.example;

public class VideoGame extends Product {
    public VideoGame(String title, int price) {
        super(title, price);
    }


    public int calculatePrice() {
        return getPrice();
    }
}
