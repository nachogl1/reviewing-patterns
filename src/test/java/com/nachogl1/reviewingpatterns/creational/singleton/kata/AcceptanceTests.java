package com.nachogl1.reviewingpatterns.creational.singleton.kata;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptanceTests {


    @Disabled
    @Test
    void outputMessageIsCorrect() {
    }

    @Test
    void differentThreadsAccessSameObjectRef() throws InterruptedException {

        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        TestThread t3 = new TestThread();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        assertEquals(t1.getLogManager(), t2.getLogManager());
        assertEquals(t2.getLogManager(), t3.getLogManager());

    }
}

class TestThread extends Thread {
    private LogManager logManager;

    public void run() {
        this.logManager = LogManager.getInstance();
        this.logManager.log("I am thread"+ this.getName());
    }

    public LogManager getLogManager() {
        return this.logManager;
    }
}