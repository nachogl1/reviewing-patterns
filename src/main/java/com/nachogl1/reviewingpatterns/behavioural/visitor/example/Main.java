package com.nachogl1.reviewingpatterns.behavioural.visitor.example;

import com.nachogl1.reviewingpatterns.behavioural.visitor.example.client.Bank;
import com.nachogl1.reviewingpatterns.behavioural.visitor.example.client.Client;
import com.nachogl1.reviewingpatterns.behavioural.visitor.example.client.Restaurant;
import com.nachogl1.reviewingpatterns.behavioural.visitor.example.visitor.InsuranceMessageVisitorService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InsuranceMessageVisitorService visitor = new InsuranceMessageVisitorService();

        Bank bank = new Bank();
        Restaurant restaurant = new Restaurant();

        List<Client> clients = Arrays.asList(bank, restaurant);

        visitor.sendMessage(clients);

    }
}
