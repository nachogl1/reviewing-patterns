package com.nachogl1.reviewingpatterns.behavioural.command.kata;

import com.nachogl1.reviewingpatterns.behavioural.command.kata.display.Display;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.executor.TransactionExecutor;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.formatter.Formatter;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.formatter.TransactionFormatter;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.clock.CoolClock;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.executor.Executor;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.repos.TransactionRepository;
import com.nachogl1.reviewingpatterns.behavioural.command.kata.repos.TransactionRepositoryInMem;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.mockito.Mockito.*;

public class AcceptanceTest {

    @Test
    void returnCorrectDisplayWhenInit() {
        Display displayMock = mock(Display.class);
        CoolClock clockMock = mock(CoolClock.class);
        Executor executor = new TransactionExecutor();
        Formatter formatter = new TransactionFormatter();
        TransactionRepository repo = new TransactionRepositoryInMem();
        CoolBankAccount account = new CoolBankAccount(repo, executor, displayMock, formatter, clockMock);
        when(clockMock.now())
                .thenReturn(LocalDate.of(2020, 1, 10))
                .thenReturn(LocalDate.of(2020, 1, 15))
                .thenReturn(LocalDate.of(2020, 1, 16))
                .thenReturn(LocalDate.of(2020, 1, 17))
                .thenReturn(LocalDate.of(2020, 1, 20))
                .thenReturn(LocalDate.of(2021, 1, 10))
                .thenReturn(LocalDate.of(2021, 1, 10));

        account.deposit(10000);
        account.deposit(10000);
        account.withdraw(5400);
        account.withdraw(100);
        account.withdraw(200);
        account.deposit(500);

        account.getSummary();
        verify(displayMock).display("Your total balance by 2021-01-10 is 14800 $");
    }
}
