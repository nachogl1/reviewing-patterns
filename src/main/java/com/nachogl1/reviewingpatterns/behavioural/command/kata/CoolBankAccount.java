package com.nachogl1.reviewingpatterns.behavioural.command.kata;

import com.nachogl1.reviewingpatterns.behavioural.command.kata.command.Command;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.command.DepositCommand;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.command.WithdrawCommand;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.display.Display;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.executor.Executor;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.formatter.Formatter;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.repos.TransactionRepository;

import java.util.Collection;

public class CoolBankAccount {

    private final TransactionRepository repo;
    private final Executor executor;
    private final Display display;
    private final Formatter formatter;

    public CoolBankAccount(TransactionRepository repo, Executor executor, Display display, Formatter formatter) {
        this.repo = repo;
        this.executor = executor;
        this.display = display;
        this.formatter = formatter;
    }

    public void deposit(int amount) {
        this.repo.save(new DepositCommand(amount));
    }

    public void withdraw(int amount) {
        this.repo.save(new WithdrawCommand(amount));
    }

    public void getSummary() {
        Collection<Command> commands = repo.findAll();
        int totalBalance = this.executor.executeAllTransactions(commands);
        String formattedSummary = this.formatter.format(totalBalance);
        this.display.display(formattedSummary);
    }
}
