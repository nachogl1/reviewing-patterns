package com.nachogl1.reviewingpatterns.behavioural.strategy;

import com.nachogl1.reviewingpatterns.behavioural.strategy.strategies.EthereumBridgePayment;
import com.nachogl1.reviewingpatterns.behavioural.strategy.strategies.PaymentDetails;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        PaymentDetails details = new PaymentDetails();
        EthereumBridgePayment ethPayment = checkDetailsValidityForEthTransaction(details);
        List<ShopItem> items = getTestItems();

        service.pay(ethPayment,items);

    }

    private static List<ShopItem> getTestItems() {
        List<ShopItem> items = new ArrayList<>();

        items.add(new ShopItem("Shoes", new BigDecimal(30)));
        items.add(new ShopItem("Socks", new BigDecimal(35.66)));
        items.add(new ShopItem("Shirt", new BigDecimal(350.46)));

        return items;
    }

    private static EthereumBridgePayment checkDetailsValidityForEthTransaction(PaymentDetails details) {
        //checks and returns the payment strategy ready
        return new EthereumBridgePayment(details);
    }
}
