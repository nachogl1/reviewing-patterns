package com.nachogl1.reviewingpatterns.creational.abstractFactory.kata;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createSimpleNotification(String recipient, String message) {
        return new Email(recipient, message, NotificationType.EMAIL);
    }
}
