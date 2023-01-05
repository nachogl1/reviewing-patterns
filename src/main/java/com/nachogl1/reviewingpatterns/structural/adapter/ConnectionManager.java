package com.nachogl1.reviewingpatterns.structural.adapter;

import com.nachogl1.reviewingpatterns.structural.adapter.oldConnections.Connection;

public class ConnectionManager {
    private final Connection con;

    public ConnectionManager(Connection con) {
        this.con = con;
    }

    public void connect(){
        this.con.start();
    }
}
