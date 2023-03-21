package com.nachogl1.reviewingpatterns.structural.adapter.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptanceTests {
    @Test
    void DbInteractionIsCorrectWithTheAdapter() {
        OldDbSystemContract inventorySystem = new DBAdapter(new NewDatabaseSystemInMem());

        inventorySystem.addProduct("iPhone", 10);
        inventorySystem.addProduct("Samsung Galaxy", 5);

        assertEquals(10, inventorySystem.getQuantity("iPhone"));
        assertEquals(5, inventorySystem.getQuantity("Samsung Galaxy"));
    }
}
