**Information about the kata:**
*This kata aims for the developer to use Command Pattern, this pattern allows you to wrap commands/requests
into objects that can be triggered by an invoker*

*I am using dates for trxs but this is only to give the exercise realism because in the solution
have no use (in my solution)

# Cool Bank

Implement a simple personal bank account system that accepts Deposits and Withdrawals. Everytime the system starts it
will process all the transactions and update you of the current status.

The current transactions (IN ORDER) are :

Date        Trx type    Amount
2020-01-10  Deposit     10000 $
2020-01-15  Deposit     10000 $
2020-01-16  Withdraw     5400 $
2020-01-17  Withdraw      100 $
2020-01-20  Withdraw      200 $
2021-01-10  Deposit       500 $

Everytime the system starts, it needs to print the following message.
Note the type of amount is not relevant.
You may want to ignore dates if you use the right data structure, the aim is to understand the pattern not to get
the perfect system.

Your total balance by 2021-01-10 is 14800 $