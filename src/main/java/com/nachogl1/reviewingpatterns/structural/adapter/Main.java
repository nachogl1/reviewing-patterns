package com.nachogl1.reviewingpatterns.structural.adapter;

import com.nachogl1.reviewingpatterns.structural.adapter.newConnections.ConnectionCImpl;
import com.nachogl1.reviewingpatterns.structural.adapter.newConnections.ConnectionCImplAdapter;
import com.nachogl1.reviewingpatterns.structural.adapter.oldConnections.ConnectionAImpl;

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
