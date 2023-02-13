package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.handlers;

import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.example.DatabaseConnection;
import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.DBConn;

public class UserExistsHandler extends Handler {

    private DBConn connection;

    public UserExistsHandler(DBConn connection) {
        this.connection = connection;
    }

    @Override
    public boolean internalConditionForCheck(String username, String password) {
        if (!this.connection.isValidUser(username)) {
            System.out.println("User does not exists");
            return false;
        }
        return true;
    }
}
