package com.nachogl1.reviewingpatterns.behavioural.visitor.client;

import com.nachogl1.reviewingpatterns.behavioural.visitor.visitor.Visitor;

public interface Client {
    void accept(Visitor visitor);
}
