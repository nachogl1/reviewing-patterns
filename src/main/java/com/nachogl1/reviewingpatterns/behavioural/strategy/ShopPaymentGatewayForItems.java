package com.nachogl1.reviewingpatterns.behavioural.strategy;

import com.nachogl1.reviewingpatterns.behavioural.strategy.strategies.PaymentStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class ShopPaymentGatewayForItems {

    private final List<ShopItem> itemsToBePurchased;

    public ShopPaymentGatewayForItems(List<ShopItem> itemsToBePurchased) {
        this.itemsToBePurchased = itemsToBePurchased;
    }

    public boolean payUsingStrategy(PaymentStrategy strategy) {
        BigDecimal amountToBePaid = calculateTotal();
        return strategy.pay(amountToBePaid);
    }

    private BigDecimal calculateTotal() {
        BigDecimal total = itemsToBePurchased.stream().map(ShopItem::getTotalPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
        return roundUpTwoPlaces(total);
    }

    private BigDecimal roundUpTwoPlaces(BigDecimal total) {
        return total.setScale(2, RoundingMode.CEILING);
    }
}
