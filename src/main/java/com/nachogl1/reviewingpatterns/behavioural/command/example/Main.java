package com.nachogl1.reviewingpatterns.behavioural.command.example;

import com.nachogl1.reviewingpatterns.behavioural.command.example.account.Customer;
import com.nachogl1.reviewingpatterns.behavioural.command.example.account.JoinGBPAccount;
import com.nachogl1.reviewingpatterns.behavioural.command.example.account.PersonalGBPAccount;
import com.nachogl1.reviewingpatterns.behavioural.command.example.command.Command;
import com.nachogl1.reviewingpatterns.behavioural.command.example.command.Deposit;
import com.nachogl1.reviewingpatterns.behavioural.command.example.command.UserCommandsExecutor;
import com.nachogl1.reviewingpatterns.behavioural.command.example.command.Withdraw;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer());
        customers.add(new Customer());

        JoinGBPAccount joinAccount = new JoinGBPAccount(customers);
        PersonalGBPAccount personalAccount = new PersonalGBPAccount();

        UserCommandsExecutor executor = new UserCommandsExecutor();

        Command deposit1 = new Deposit(100, personalAccount);
        executor.addCommand(deposit1);
        Command deposit2 = new Deposit(1000, personalAccount);
        executor.addCommand(deposit2);
        Command withdrawal1 = new Withdraw(10, personalAccount);
        executor.addCommand(withdrawal1);
        executor.executeAll();

        Command deposit3 = new Deposit(10000, joinAccount);
        executor.addCommand(deposit3);
        Command withdrawal2 = new Withdraw(1998, joinAccount);
        executor.addCommand(withdrawal2);
        executor.executeAll();

        joinAccount.showMeTheMoney();
        personalAccount.showMeTheMoney();
    }
}
