package com.nachogl1.reviewingpatterns.behavioural.strategy.example.strategies;

public class PaymentDetails {

    /*
    Generic Bundle of info for payments. I believe it is better o have different classes for different payment strategies as
    not all the strategies have the same details
    */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("//Payment details***//");
        return sb.toString();
    }
}
