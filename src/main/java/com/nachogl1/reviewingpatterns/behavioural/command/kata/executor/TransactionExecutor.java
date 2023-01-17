package com.nachogl1.reviewingpatterns.behavioural.command.kata.executor;

import com.nachogl1.reviewingpatterns.behavioural.command.kata.command.Command;

import java.util.Collection;

public class TransactionExecutor implements Executor {
    @Override
    public int executeAllTransactions(Collection<Command> commands) {
        int totalBalance = 0;
        for (Command command : commands) {
            totalBalance = command.executeOn(totalBalance);
        }
        return totalBalance;
    }
}
