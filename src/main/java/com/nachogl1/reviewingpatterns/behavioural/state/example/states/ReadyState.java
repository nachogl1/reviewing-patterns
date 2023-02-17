package com.nachogl1.reviewingpatterns.behavioural.state.example.states;

import com.nachogl1.reviewingpatterns.behavioural.state.example.VendingMachine;
import com.nachogl1.reviewingpatterns.behavioural.state.example.exceptions.CommandUnavailable;

import java.math.BigDecimal;

public class ReadyState extends VendingState {

    private static final String STATE_INTRO = "MACHINE READY FOR CASH COLLECTION";

    public ReadyState(VendingMachine machine) {
        super(machine);
        displayState(STATE_INTRO);
    }

    @Override
    public void collect(BigDecimal amount) {
        machine.addCash(amount);

        BigDecimal total = amount.add(machine.getCollectedCash());
        updateCashDisplay(total);
    }

    @Override
    public void cancel() {
        machine.setState(new CancelTransactionState(machine));
        machine.dispenseChange();
    }

    @Override
    public void dispenseItem(String itemCode) {
        runChecks(itemCode, machine.getCollectedCash());
        machine.setState(new DispenseItemState(machine));
        machine.dispenseItem(itemCode);
    }

    @Override
    public void dispenseChange() {
        throw new CommandUnavailable(" Action not available at this stage");
    }

    @Override
    public void ready() {
        throw new CommandUnavailable("You are currently at this stage");
    }

    private void updateCashDisplay(BigDecimal total) {
        System.out.println("Start logic to update cash sum display:" + total);
    }

    private void runChecks(String itemCode, BigDecimal collectedAmount) {
        checkItemAvailability(itemCode);
        checkCashForProduct(itemCode, collectedAmount);
    }

    private void checkCashForProduct(String itemCode, BigDecimal collectedAmount) {
        System.out.println("Checking price surpass or equals to collected cash");
    }

    private void checkItemAvailability(String itemCode) {
        System.out.println("Checking item availability");
    }
}
