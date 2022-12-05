package com.nachogl1.reviewingpatterns.behavioural.visitor.visitor;

import com.nachogl1.reviewingpatterns.behavioural.visitor.client.Bank;
import com.nachogl1.reviewingpatterns.behavioural.visitor.client.Client;
import com.nachogl1.reviewingpatterns.behavioural.visitor.client.Restaurant;

import java.util.List;

public class InsuranceMessageVisitorService implements Visitor {

    public void sendMessage(List<Client> clients) {
        clients.forEach(client -> client.accept(this));
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("Message for Bank");
    }

    @Override
    public void visit(Restaurant restaurant) {
        System.out.println("Message for restaurant");
    }
}
