package com.nachogl1.reviewingpatterns.behavioural.visitor.visitor;

import com.nachogl1.reviewingpatterns.behavioural.visitor.client.Bank;
import com.nachogl1.reviewingpatterns.behavioural.visitor.client.Restaurant;

public interface Visitor {
    void visit(Bank bank);
    void visit(Restaurant restaurant);
}
