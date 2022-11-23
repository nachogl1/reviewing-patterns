package com.nachogl1.reviewingpatterns.behavioural.state;

import com.nachogl1.reviewingpatterns.behavioural.state.states.ReadyState;
import com.nachogl1.reviewingpatterns.behavioural.state.states.VendingState;

import java.math.BigDecimal;

public class VendingMachine {
    private VendingState currentState = new ReadyState(this);
    private BigDecimal collectedAmount = BigDecimal.ZERO;

    public void collect(BigDecimal amount) {
        currentState.collect(amount);
    }

    public void addCash(BigDecimal amount) {
        collectedAmount.add(amount);
    }

    public void cancel() {
        currentState.cancel();
    }

    public BigDecimal getCollectedCash() {
        return this.collectedAmount;
    }

    public void dispenseChange() {
        currentState.dispenseChange();
    }

    public void ready() {
        currentState.ready();
    }

    public void dispenseItem(String itemCode) {
        currentState.dispenseItem(itemCode);
    }

    public void setState(VendingState newState) {
        this.currentState = newState;
    }

    public void cashToZero() {
        this.collectedAmount = BigDecimal.ZERO;
    }

}
