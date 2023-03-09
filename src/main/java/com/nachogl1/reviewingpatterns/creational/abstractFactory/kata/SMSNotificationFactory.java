package com.nachogl1.reviewingpatterns.creational.abstractFactory.kata;

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification createSimpleNotification(String recipient, String message) {
        return new SMS(recipient, message);
    }
}
