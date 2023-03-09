package com.nachogl1.reviewingpatterns.creational.abstractFactory.kata;

public class PushNotification extends Notification {
    public PushNotification(String recipient, String message, NotificationType type) {
        super(recipient, message, type);
    }
}
