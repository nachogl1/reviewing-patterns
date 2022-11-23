package com.nachogl1.reviewingpatterns.behavioural.state.exceptions;

public class CommandUnavailable extends RuntimeException {
    public CommandUnavailable(String message) {
        super(message);
    }
}
