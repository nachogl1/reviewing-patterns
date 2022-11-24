package com.nachogl1.reviewingpatterns.behavioural.strategy.strategies;

import javax.print.DocFlavor;
import java.math.BigDecimal;

public class GooglePayPayment implements PaymentStrategy {

    private static final String METHOD_NAME = "GOOGLE_PAY";
    private final PaymentDetails paymentDetails;

    public GooglePayPayment(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @Override
    public boolean pay(BigDecimal amountToPay) {
        System.out.println(String.format("Paying amount of %s with payment method %s and payment details %s", amountToPay.toString(), METHOD_NAME, paymentDetails.toString()));
        return true;
    }
}
