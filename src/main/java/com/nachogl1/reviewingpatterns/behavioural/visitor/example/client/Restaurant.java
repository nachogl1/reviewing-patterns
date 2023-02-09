package com.nachogl1.reviewingpatterns.behavioural.visitor.example.client;

import com.nachogl1.reviewingpatterns.behavioural.visitor.example.visitor.Visitor;

public class Restaurant implements Client {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
