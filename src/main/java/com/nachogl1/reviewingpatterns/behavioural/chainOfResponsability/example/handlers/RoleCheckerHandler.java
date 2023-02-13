package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.example.handlers;

import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.example.DatabaseConnection;

public class RoleCheckerHandler extends Handler {
    private DatabaseConnection connection;

    public RoleCheckerHandler(DatabaseConnection connection) {
        this.connection = connection;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!this.connection.isUserAdmin(username)) {
            System.out.println("User is valid but invalid role");
            return false;
        }
        return handleNext(username, password);
    }
}
