package com.nachogl1.reviewingpatterns.behavioural.strategy.strategies;

import java.math.BigDecimal;

public interface PaymentStrategy {

    boolean pay(BigDecimal amountToPay);

}
