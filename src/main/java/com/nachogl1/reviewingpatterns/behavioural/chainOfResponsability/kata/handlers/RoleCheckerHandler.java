package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.handlers;

import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.example.DatabaseConnection;
import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.DBConn;

public class RoleCheckerHandler extends Handler {
    private DBConn connection;

    public RoleCheckerHandler(DBConn connection) {
        this.connection = connection;
    }

    @Override
    public boolean internalConditionForCheck(String username, String password) {
        if (!this.connection.isUserAdmin(username)) {
            System.out.println("User is valid but invalid role");
            return false;
        }
        return true;
    }
}
