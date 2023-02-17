package com.nachogl1.reviewingpatterns.behavioural.state.example.states;

import com.nachogl1.reviewingpatterns.behavioural.state.example.VendingMachine;
import com.nachogl1.reviewingpatterns.behavioural.state.example.exceptions.CommandUnavailable;

import java.math.BigDecimal;

public class DispenseChangeState extends VendingState {

    private static final String STATE_INTRO = "RETURNING CHANGE TO CUSTOMER";

    public DispenseChangeState(VendingMachine machine) {
        super(machine);
        displayState(STATE_INTRO);

    }

    @Override
    public void dispenseChange() {
        returnCashToCustomer();
        machine.setState(new ReadyState(machine));
    }

    @Override
    public void ready() {
        returnCashToCustomer();
        machine.setState(new ReadyState(machine));
    }
    @Override
    public void collect(BigDecimal amount) {
        throw new CommandUnavailable("Action not available at this stage");
    }

    @Override
    public void cancel() {
        throw new CommandUnavailable("Action not available at this stage");
    }

    @Override
    public void dispenseItem(String itemCode) {
        throw new CommandUnavailable("Action not available at this stage");
    }


    private void returnCashToCustomer() {
        System.out.println("Starting logic to return collected money to customer");
        machine.cashToZero();
        updateCashDisplay();
    }

    private void updateCashDisplay() {
        System.out.println("Start logic to update cash sum display");
    }

}
