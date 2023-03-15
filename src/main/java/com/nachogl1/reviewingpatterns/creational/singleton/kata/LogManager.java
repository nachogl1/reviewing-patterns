package com.nachogl1.reviewingpatterns.creational.singleton.kata;

public class LogManager {
    private static volatile LogManager instance = new LogManager();

    private LogManager() {
    }

    public static LogManager getInstance() {
        if (instance == null) {
            synchronized (LogManager.class) {
                if (instance == null) {
                    instance = new LogManager();
                }
            }
        }

        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
