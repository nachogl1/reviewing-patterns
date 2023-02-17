package com.nachogl1.reviewingpatterns.behavioural.state.example.states;

import com.nachogl1.reviewingpatterns.behavioural.state.example.VendingMachine;

import java.math.BigDecimal;

public abstract class VendingState {

    protected final VendingMachine machine;

    public VendingState(VendingMachine machine) {
        this.machine = machine;
    }

    public abstract void cancel();

    public abstract void dispenseChange();

    public abstract void dispenseItem(String itemCode);

    public abstract void collect(BigDecimal amount);

    public abstract void ready();

    protected void displayState(String stateIntroduction){
        System.out.println(stateIntroduction);
    }
}
