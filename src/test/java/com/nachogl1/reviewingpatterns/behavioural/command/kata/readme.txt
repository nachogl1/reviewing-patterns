**Information about the kata:**
*This kata aims for the developer to use Command Pattern, this pattern allows you to wrap commands/requests
into objects that can be triggered by an invoker*

# Cool Bank

Implement a simple personal bank account system that accepts Deposits and Withdrawals. Everytime the system starts it
will process all the transactions and update you of the current status.

The current transactions are:

Date        Trx type    Amount
10/01/2020  Deposit     10000 $
15/01/2020  Deposit     10000 $
16/01/2020  Withdraw     5400 $
17/01/2020  Withdraw      100 $
20/01/2020  Withdraw      200 $
10/01/2021  Deposit       500 $

Everytime the system starts, it needs to print the following message.
Note the type of amount is not relevant.
You may want to ignore dates if you use the right data structure, the aim is to understand the pattern not to get
the perfect system.

Your total balance is 14800 $