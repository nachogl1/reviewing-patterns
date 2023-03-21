package com.nachogl1.reviewingpatterns.structural.adapter.example.newConnections;

public class ConnectionCImpl {
    public String processA() {
        return "Biproduct";
    }

    public String processB(String biproductOfProcess) {
        return "Connecting to DB C...";
    }
}
