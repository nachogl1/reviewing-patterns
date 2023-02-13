package com.nachogl1.reviewingpatterns.behavioural.chainOfResponsability.kata.handlers;

public abstract class Handler {
    private Handler handler;

    public Handler cycleHandler(Handler cycledHandler) {
        this.handler = cycledHandler;
        return this.handler;
    }

    public boolean handle(String username, String password) {
        if (!this.internalConditionForCheck(username, password)) {
            return false;
        }
        return this.handleNext(username, password);
    }

    protected abstract boolean internalConditionForCheck(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (this.handler == null) {
            return true;
        }
        return this.handler.handle(username, password);
    }
}
