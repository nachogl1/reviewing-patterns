package com.nachogl1.reviewingpatterns.behavioural.command.kata;

import com.nachogl1.reviewingpatterns.behavioural.command.kata.display.Display;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.executor.Executor;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.executor.TransactionExecutor;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.formatter.Formatter;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.formatter.TransactionFormatter;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.repos.TransactionRepository;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.repos.TransactionRepositoryInMem;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AcceptanceTest {

    @Test
    void returnCorrectDisplayWhenInit() {
        Display displayMock = mock(Display.class);
        Executor executorMock = new TransactionExecutor();
        Formatter formatterMock = new TransactionFormatter();
        TransactionRepository repoMock = new TransactionRepositoryInMem();
        CoolBankAccount account = new CoolBankAccount(repoMock, executorMock, displayMock, formatterMock);

        account.deposit(10000);
        account.deposit(10000);
        account.withdraw(5400);
        account.withdraw(100);
        account.withdraw(200);
        account.deposit(500);

        account.getSummary();
        verify(displayMock).display("Your total balance is 14800 $");
    }
}
