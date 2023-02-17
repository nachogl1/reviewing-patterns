package com.nachogl1.reviewingpatterns.behavioural.state.example.states;

import com.nachogl1.reviewingpatterns.behavioural.state.example.VendingMachine;
import com.nachogl1.reviewingpatterns.behavioural.state.example.exceptions.CommandUnavailable;

import java.math.BigDecimal;

public class CancelTransactionState extends VendingState {
    private static final String STATE_INTRO = "CANCELLING PROCESS";

    public CancelTransactionState(VendingMachine machine) {
        super(machine);
        displayState(STATE_INTRO);
    }

    @Override
    public void dispenseChange() {
        machine.setState(new DispenseChangeState(machine));
        machine.ready();
    }

    @Override
    public void cancel() {
        throw new CommandUnavailable("Action not available at this stage");

    }

    @Override
    public void dispenseItem(String itemCode) {
        throw new CommandUnavailable("Action not available at this stage");

    }

    @Override
    public void collect(BigDecimal amount) {
        throw new CommandUnavailable("Action not available at this stage");
    }

    @Override
    public void ready() {
        throw new CommandUnavailable("Action not available at this stage");
    }

}
