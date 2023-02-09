package com.nachogl1.reviewingpatterns.behavioural.visitor.kata.client;

import com.nachogl1.reviewingpatterns.behavioural.visitor.kata.visitor.CoolVisitor;

public record PublicInstitution(String name) implements CoolClient {

    @Override
    public void accept(CoolVisitor visitor) {
        visitor.visit(this);
    }
}
