package com.nachogl1.reviewingpatterns.behavioural.command.kata.formatter;

import java.time.LocalDate;

public class TransactionFormatter implements Formatter {
    @Override
    public String formatForDate(int totalBalance, LocalDate date) {
        StringBuilder summary = new StringBuilder();
        summary.append(String.format("Your total balance by %s is %d $", date.toString(), totalBalance));
        return summary.toString();
    }
}
