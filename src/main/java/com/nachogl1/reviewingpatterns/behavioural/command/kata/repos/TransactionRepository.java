package com.nachogl1.reviewingpatterns.behavioural.command.kata.repos;

import com.nachogl1.reviewingpatterns.behavioural.command.kata.command.Command;

import java.util.Collection;

public interface TransactionRepository {
    void save(Command command);

    Collection<Command> findAll();
}
