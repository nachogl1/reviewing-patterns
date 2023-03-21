package com.nachogl1.reviewingpatterns.structural.adapter.example.newConnections;

import com.nachogl1.reviewingpatterns.structural.adapter.example.oldConnections.Connection;

public class ConnectionCImplAdapter implements Connection {

    private final ConnectionCImpl connection;

    public ConnectionCImplAdapter(ConnectionCImpl connection) {
        this.connection = connection;
    }

    @Override
    public void start() {
        String biproductOfProcess = connection.processA();
        String result = connection.processB(biproductOfProcess);
        System.out.println(result);
    }
}
