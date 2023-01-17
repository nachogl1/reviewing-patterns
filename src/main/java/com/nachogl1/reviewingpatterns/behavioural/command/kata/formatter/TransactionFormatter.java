package com.nachogl1.reviewingpatterns.behavioural.command.kata.formatter;

import java.time.LocalDate;

public class TransactionFormatter implements Formatter {
    @Override
    public String format(int totalBalance) {
        StringBuilder summary = new StringBuilder();
        summary.append(String.format("Your total balance is %d $", totalBalance));
        return summary.toString();
    }
}
