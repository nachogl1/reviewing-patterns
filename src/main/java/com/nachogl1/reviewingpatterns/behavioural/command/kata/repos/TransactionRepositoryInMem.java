package com.nachogl1.reviewingpatterns.behavioural.command.kata.repos;

import com.nachogl1.reviewingpatterns.behavioural.command.kata.command.Command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TransactionRepositoryInMem implements TransactionRepository {

    private final List<Command> commands = new ArrayList<>();

    @Override
    public void save(Command command) {
        this.commands.add(command);
    }

    @Override
    public Collection<Command> findAll() {
        return commands;
    }


}
