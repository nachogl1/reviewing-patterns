package com.nachogl1.reviewingpatterns.creational.abstractFactory.kata;

public class SMS extends Notification {
    public SMS(String recipient, String message) {
        super(recipient, message, NotificationType.SMS);
    }
}
