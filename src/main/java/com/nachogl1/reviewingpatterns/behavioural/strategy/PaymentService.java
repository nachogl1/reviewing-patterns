package com.nachogl1.reviewingpatterns.behavioural.strategy;

import com.nachogl1.reviewingpatterns.behavioural.strategy.strategies.PaymentStrategy;

import java.util.List;

public class PaymentService {

    public boolean pay(PaymentStrategy strategy, List<ShopItem> items) {
        ShopPaymentGatewayForItems gateway = new ShopPaymentGatewayForItems(items);
        return gateway.payUsingStrategy(strategy);
    }


}
