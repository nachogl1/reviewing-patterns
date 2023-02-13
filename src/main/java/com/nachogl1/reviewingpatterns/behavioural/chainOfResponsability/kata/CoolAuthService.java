package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata;


import com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.handlers.Handler;

public class CoolAuthService {
    private final Handler handler;

    public CoolAuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean login(String username, String password) {
        return handler.handle(username, password);
    }
}
