package com.nachogl1.reviewingpatterns.creational.abstractFactory.kata;

public abstract class Notification {
    private final String message;
    private final String recipient;
    private final NotificationType type;

    public Notification(String recipient, String message, NotificationType type) {
        this.message = message;
        this.recipient = recipient;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public String getRecipient() {
        return recipient;
    }

    public NotificationType getType() {
        return type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Notification{");
        sb.append("message='").append(message).append('\'');
        sb.append(", recipient='").append(recipient).append('\'');
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
