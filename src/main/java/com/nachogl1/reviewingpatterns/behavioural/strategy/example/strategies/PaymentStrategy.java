package com.nachogl1.reviewingpatterns.behavioural.strategy.example.strategies;

import java.math.BigDecimal;

public interface PaymentStrategy {

    boolean pay(BigDecimal amountToPay);

}
