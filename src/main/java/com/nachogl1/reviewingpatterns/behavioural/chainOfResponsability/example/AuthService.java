package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.example;

import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.example.handlers.Handler;

public class AuthService {
    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean login(String username, String password) {
        return handler.handle(username, password);
    }
}
