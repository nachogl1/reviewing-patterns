package com.nachogl1.reviewingpatterns.structural.adapter.example;

import com.nachogl1.reviewingpatterns.structural.adapter.example.newConnections.ConnectionCImpl;
import com.nachogl1.reviewingpatterns.structural.adapter.example.newConnections.ConnectionCImplAdapter;
import com.nachogl1.reviewingpatterns.structural.adapter.example.oldConnections.ConnectionAImpl;

public class Main {
    public static void main(String[] args) {
        ConnectionAImpl conA = new ConnectionAImpl();
        ConnectionCImpl conC = new ConnectionCImpl();
        ConnectionCImplAdapter adapter = new ConnectionCImplAdapter(conC);

        DBService service = new DBService();

        service.connectToDB(conA);
        service.connectToDB(adapter);
    }
}
