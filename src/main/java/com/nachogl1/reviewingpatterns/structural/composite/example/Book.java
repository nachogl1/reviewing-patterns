package com.nachogl1.reviewingpatterns.structural.composite.example;

public class Book extends Product{
    public Book(String title, int price) {
        super(title, price);
    }

    public int calculatePrice(){
        return getPrice();
    }
}
