package com.nachogl1.reviewingpatterns.behavioural.strategy.example.strategies;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentStrategy {

    private static final String METHOD_NAME = "CreditCard_PAY";


    private final PaymentDetails paymentDetails;

    public CreditCardPayment(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @Override
    public boolean pay(BigDecimal amountToPay) {
        System.out.println(String.format("Paying amount of %s with payment method %s and payment details %s", amountToPay.toString(), METHOD_NAME, paymentDetails.toString()));
        return false;
    }
}
