package com.nachogl1.reviewingpatterns.structural.proxy.example;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("MyPath/myImage");
        System.out.println("First time accessing the resource");
        image.display();
        System.out.println("Second time accessing the resource");
        image.display();
    }
}
