package com.nachogl1.reviewingpatterns.structural.adapter.example;

import com.nachogl1.reviewingpatterns.structural.adapter.example.oldConnections.Connection;

public class DBService {

    public void connectToDB(Connection connection) {
        ConnectionManager manager = new ConnectionManager(connection);
        manager.connect();
    }
}
