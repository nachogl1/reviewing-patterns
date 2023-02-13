package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.handlers;

import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.DBConn;

public class ValidPasswordHandler extends Handler {
    private DBConn connection;

    public ValidPasswordHandler(DBConn connection) {
        this.connection = connection;
    }

    @Override
    public boolean internalConditionForCheck(String username, String password) {
        if (!this.connection.isValidPasswordForUser(username, password)) {
            System.out.println("Invalid password");
            return false;
        }
        return true;
    }
}
