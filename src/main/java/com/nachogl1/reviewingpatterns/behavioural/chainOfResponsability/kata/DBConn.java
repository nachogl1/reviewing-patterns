package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata;

public interface DBConn {
    boolean isValidUser(String username);

    boolean isValidPasswordForUser(String username, String password);

    boolean isUserAdmin(String username);

}
