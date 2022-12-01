package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability;

import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.handlers.Handler;

public class AuthService {
    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean login(String username, String password) {
        return handler.handle(username, password);
    }
}
