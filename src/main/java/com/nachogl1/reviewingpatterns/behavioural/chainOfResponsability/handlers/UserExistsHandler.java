package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.handlers;

import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.DatabaseConnection;

public class UserExistsHandler extends Handler {

    private DatabaseConnection connection;

    public UserExistsHandler(DatabaseConnection connection) {
        this.connection = connection;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!this.connection.isValidUser(username)) {
            System.out.println("User does not exists");
            return false;
        }
        return handleNext(username, password);
    }
}
