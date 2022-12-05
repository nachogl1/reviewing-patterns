package com.nachogl1.reviewingpatterns.behavioural.visitor.client;

import com.nachogl1.reviewingpatterns.behavioural.visitor.visitor.Visitor;

public class Bank implements Client {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
