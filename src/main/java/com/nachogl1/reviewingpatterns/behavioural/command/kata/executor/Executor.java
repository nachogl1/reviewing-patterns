package com.nachogl1.reviewingpatterns.behavioural.command.kata.executor;

import com.nachogl1.reviewingpatterns.behavioural.command.kata.command.Command;

import java.util.Collection;

public interface Executor {
    int executeAllTransactions(Collection<Command> commands);
}
