package com.nachogl1.reviewingpatterns.creational.abstractFactory.kata;

public interface NotificationFactory {
    Notification createSimpleNotification(String recipient, String message);
}
