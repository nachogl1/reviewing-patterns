package com.nachogl1.reviewingpatterns.structural.adapter.oldConnections;

public class ConnectionBImpl implements Connection {
    @Override
    public void start() {
        System.out.println("Connecting to DB B...");
    }
}
