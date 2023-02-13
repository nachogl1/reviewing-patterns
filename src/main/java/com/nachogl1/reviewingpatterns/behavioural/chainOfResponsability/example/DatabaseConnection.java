package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.example;

public class DatabaseConnection {
    public boolean isValidUser(String username) {
        System.out.println("Checking username " + username + " in database"+ generateRandomNumber());
        return generateRandomNumber() > 3.0;
    }

    private double generateRandomNumber() {
        return Math.random() * 10;
    }

    public boolean isValidPasswordForUser(String username, String password) {
        System.out.println("Checking password for username " + username + " in database");
        return generateRandomNumber() > 2.0;
    }

    public boolean isUserAdmin(String username) {
        System.out.println("Checking role for username " + username + " in database");
        return generateRandomNumber() > 1.0;
    }
}
