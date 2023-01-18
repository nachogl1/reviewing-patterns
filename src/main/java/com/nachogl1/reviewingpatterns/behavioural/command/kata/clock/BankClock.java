package com.nachogl1.reviewingpatterns.behavioural.command.kata.clock;

import java.time.LocalDate;

public class BankClock implements CoolClock {
    @Override
    public LocalDate now() {
        return LocalDate.now();
    }
}
