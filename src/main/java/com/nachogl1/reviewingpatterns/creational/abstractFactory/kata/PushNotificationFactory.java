package com.nachogl1.reviewingpatterns.creational.abstractFactory.kata;

public class PushNotificationFactory implements NotificationFactory {
    @Override
    public Notification createSimpleNotification(String recipient, String message) {
        return new PushNotification(recipient, message, NotificationType.PUSH_NOTIFICATION);
    }
}
