package com.nachogl1.reviewingpatterns.behavioural.visitor.example.visitor;

import com.nachogl1.reviewingpatterns.behavioural.visitor.example.client.Bank;
import com.nachogl1.reviewingpatterns.behavioural.visitor.example.client.Restaurant;

public interface Visitor {
    void visit(Bank bank);
    void visit(Restaurant restaurant);
}
