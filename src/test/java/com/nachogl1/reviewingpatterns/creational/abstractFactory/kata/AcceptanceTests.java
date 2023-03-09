package com.nachogl1.reviewingpatterns.creational.abstractFactory.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptanceTests {
    @Test
    void givenClientSendsSMS_WhenMessageAndRecipientNumberProvided_ThenItGeneratesIt() {
        NotificationFactory factory = new SMSNotificationFactory();

        Notification resultNotification = factory.createSimpleNotification("07396464378", "TestMessage");

        assertEquals("07396464378", resultNotification.getRecipient());
        assertEquals("TestMessage", resultNotification.getMessage());
    }

    @Test
    void givenClientSendsEmail_WhenMessageAndRecipientEmailProvided_ThenItGeneratesIt() {
        NotificationFactory factory = new EmailNotificationFactory();

        Notification resultNotification = factory.createSimpleNotification("test@test.com", "TestMessage");

        assertEquals("test@test.com", resultNotification.getRecipient());
        assertEquals("TestMessage", resultNotification.getMessage());
    }


    @Test
    void givenClientSendsPushNotification_WhenMessageAndDeviceTokenProvided_ThenItGeneratesIt() {
        NotificationFactory factory = new PushNotificationFactory();

        Notification resultNotification = factory.createSimpleNotification("985hUGH66", "TestMessage");

        assertEquals("985hUGH66", resultNotification.getRecipient());
        assertEquals("TestMessage", resultNotification.getMessage());
    }
}
