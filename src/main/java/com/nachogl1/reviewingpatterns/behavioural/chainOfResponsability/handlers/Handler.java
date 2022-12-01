package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.handlers;

public abstract class Handler {
    private Handler handler;

    public Handler cycleHandler(Handler h) {
        this.handler = h;
        return this.handler;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (this.handler == null) {
            return true;
        }
        return this.handler.handle(username, password);
    }
}
