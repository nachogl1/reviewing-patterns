package com.nachogl1.reviewingpatterns.behavioural.visitor.kata.client;

import com.nachogl1.reviewingpatterns.behavioural.visitor.kata.visitor.CoolVisitor;

public interface CoolClient {
    void accept(CoolVisitor visitor);
}
