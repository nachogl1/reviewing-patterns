package com.nachogl1.reviewingpatterns.structural.adapter;

import com.nachogl1.reviewingpatterns.structural.adapter.oldConnections.Connection;

public class Service {

    public void connectToDB(Connection connection) {
        ConnectionManager manager = new ConnectionManager(connection);
        manager.connect();
    }
}
