package com.nachogl1.reviewingpatterns.behavioural.visitor.example.client;

import com.nachogl1.reviewingpatterns.behavioural.visitor.example.visitor.Visitor;

public interface Client {
    void accept(Visitor visitor);
}
