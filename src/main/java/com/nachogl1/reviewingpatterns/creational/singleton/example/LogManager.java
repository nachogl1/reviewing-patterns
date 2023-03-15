package com.nachogl1.reviewingpatterns.creational.singleton.example;

public class LogManager {

    private static LogManager instance;

    private LogManager() {
    }

    public static LogManager getInstance() {
        if (instance == null) instance = new LogManager();

        return instance;
    }

    public void debug(String message) {
        System.out.println("DEBUG: " + message);
    }

    public void info(String message) {
        System.out.println("INFO: " + message);
    }

    public void warn(String message) {
        System.out.println("WARN: " + message);
    }

    public void error(String message) {
        System.out.println("ERROR: " + message);
    }

}
