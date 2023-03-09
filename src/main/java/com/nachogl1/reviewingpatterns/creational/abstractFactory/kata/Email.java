package com.nachogl1.reviewingpatterns.creational.abstractFactory.kata;

public class Email extends Notification {
    public Email(String recipient, String message, NotificationType type) {
        super(recipient, message, type);
    }
}
