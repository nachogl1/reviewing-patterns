package com.nachogl1.reviewingpatterns.behavioural.strategy.example.strategies;

import java.math.BigDecimal;

public class EthereumBridgePayment implements PaymentStrategy {

    private static final String METHOD_NAME = "ETH_PAY";

    private final PaymentDetails paymentDetails;

    public EthereumBridgePayment(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @Override
    public boolean pay(BigDecimal amountToPay) {
        System.out.println(String.format("Paying amount of %s with payment method %s and payment details %s", amountToPay.toString(), METHOD_NAME, paymentDetails.toString()));
        return true;
    }
}
