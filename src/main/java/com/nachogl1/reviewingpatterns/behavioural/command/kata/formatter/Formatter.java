package com.nachogl1.reviewingpatterns.behavioural.command.kata.formatter;

import java.time.LocalDate;

public interface Formatter {
    String formatForDate(int totalBalance, LocalDate date);
}
