package com.nachogl1.reviewingpatterns.behavioural.state.example.states;

import com.nachogl1.reviewingpatterns.behavioural.state.example.VendingMachine;
import com.nachogl1.reviewingpatterns.behavioural.state.example.exceptions.CommandUnavailable;

import java.math.BigDecimal;

public class DispenseItemState extends VendingState {

    private static final String STATE_INTRO = "DISPENSING ITEM TO CUSTOMER";

    public DispenseItemState(VendingMachine machine) {
        super(machine);
        displayState(STATE_INTRO);
    }

    @Override
    public void dispenseItem(String itemCode) {
        dispenseItemToCustomer(itemCode);
        machine.setState(new DispenseChangeState(machine));
        machine.dispenseChange();
    }


    @Override
    public void cancel() {
        throw new CommandUnavailable("Action not available at this stage");

    }

    @Override
    public void ready() {
        throw new CommandUnavailable("Action not available at this stage");
    }

    @Override
    public void dispenseChange() {
        throw new CommandUnavailable("Action not available at this stage");

    }

    @Override
    public void collect(BigDecimal amount) {
        throw new CommandUnavailable("Action not available at this stage");

    }

    private void dispenseItemToCustomer(String itemCode) {
        System.out.println("start logic to give the item to the client: "+ itemCode);
    }
}
