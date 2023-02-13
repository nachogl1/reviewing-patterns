package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.example.handlers;

import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.example.DatabaseConnection;

public class ValidPasswordHandler extends Handler {
    private DatabaseConnection connection;

    public ValidPasswordHandler(DatabaseConnection connection) {
        this.connection = connection;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!this.connection.isValidPasswordForUser(username, password)) {
            System.out.println("Invalid password");

            return false;
        }
        return handleNext(username, password);
    }
}
