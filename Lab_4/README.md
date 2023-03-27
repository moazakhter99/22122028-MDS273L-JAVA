## Question

Write a JAVA Menu driven program that does the following:
1. You can ONLY have the below variables as global variables
- Account Number
- Account Holder Name
- Account Balance
2. You MUST have the below as functions
- To initialize the customer
- To deposit money
- To withdraw money
- To print the transactions
- To print account summary
3. Your menu will have the following operations once the customer is created
- To deposit money
- To withdraw money
- To print the transactions
- To print account summary

## Program Description

1. 4 Static functions
- For Account number
- For Account Holder name
- For Account Balance
- For Scanner class (Taking Input)

2. Initialization Function
- Takes in User Name
- Takes in User Account Number
- Takes in User Previous Balance

3. Withdraw Function
- Takes the amout to be withdrawn as an argument
- If the amount is more than the balance then informs user
- returns false
- else deducts the amount from the balance
- returns true
- Informs the User

4. Deposit Function
- Takes the amount to be deposited as an argument
- Adds the amount to the balance
- Informs the User

5. Transaction History Function
- Takes in 3 Arguments
    - List of the types of transaction
    - List of the amount added or deducted
    - List of the balance after each transaction
- Loops through the lists using index 
- Prints each of the transactions

6. Account Summary function
- Prints the user name
- Prints the user Account Number
- Prints the user Current Balance
- Prints the Total number of transactions
- Calls the Transaction History function to print all the transactions

7. The Main Function
- New Object for the list of transaction Amounts
- New Object for the list of transaction types
- new onject for the list of balances after each transactions
- Initialize the Account
- Call the initialization function
- Initiate a choice variable
- Create a count variale to keep the count of the transactions
- Start a Do While Loop
    - Take user input for the choice of transaction
    - Start Switch case statement
        - case == 1
            - Takes the amount to be withdrawn
            - calls the withdraw  fuctions
            - if function returns true
            - Adds the type of transaction, transaction Amount, and the balance in its repective lists 
        - case == 2
            - Takes the amount to be deposit
            - calls the deposit  fuctions
            - Adds the type of transaction, transaction Amount, and the balance in its repective lists
        - case == 3
            - call the transaction History function
        - case == 4
            - call the Account Summary fucntion
        - case == 5
            - break
        - default
            - Prints "Wrong Input"
    While choice == 5 



## Output
<br>
<br>Enter your info to initialize your account
<br>Enter your Name: Moaz Akhter
<br>Enter your account No.: 22122028
<br>Enter your previous balance: 5000
<br>Your account has been initialized.
<br>
<br>Press 1 to Withdraw
<br>Press 2 to Deposit
<br>Press 3 to get the Transaction History
<br>Press 4 to get Account Summary
<br>Press 5 to exit the program
<br>Enter your choice:
<br>1
<br>Enter your amount:
<br>500
<br>The money has been withdrawn.
<br>The balance has been updated.
<br>
<br>Press 1 to Withdraw
<br>Press 2 to Deposit
<br>Press 3 to get the Transaction History
<br>Press 4 to get Account Summary
<br>Press 5 to exit the program
<br>Enter your choice:
<br>2
<br>Enter your amount:
<br>200
<br>The money has been deposited in your account.
<br>The balance has been updated.
<br>
<br>Press 1 to Withdraw
<br>Press 2 to Deposit
<br>Press 3 to get the Transaction History
<br>Press 4 to get Account Summary
<br>Press 5 to exit the program
<br>
<br>Enter your choice:
<br>2
<br>Enter your amount:
<br>650
<br>The money has been deposited in your account.
<br>The balance has been updated.
<br>
<br>Press 1 to Withdraw
<br>Press 2 to Deposit
<br>Press 3 to get the Transaction History
<br>Press 4 to get Account Summary
<br>Press 5 to exit the program
<br>Enter your choice:
<br>1
<br>Enter your amount:
<br>200
<br>The money has been withdrawn.
<br>The balance has been updated.
<br>
<br>Press 1 to Withdraw
<br>Press 2 to Deposit
<br>Press 3 to get the Transaction History
<br>Press 4 to get Account Summary
<br>Press 5 to exit the program
<br>Enter your choice:
<br>2
<br>Enter your amount:
<br>530
<br>The money has been deposited in your account.
<br>The balance has been updated.
<br>
<br>Press 1 to Withdraw
<br>Press 2 to Deposit
<br>Press 3 to get the Transaction History
<br>Press 4 to get Account Summary
<br>Press 5 to exit the program
<br>Enter your choice:
<br>2
<br>Enter your amount:
<br>420
<br>The money has been deposited in your account.
<br>The balance has been updated.
<br>
<br>Press 1 to Withdraw
<br>Press 2 to Deposit
<br>Press 3 to get the Transaction History
<br>Press 4 to get Account Summary
<br>Press 5 to exit the program
<br>Enter your choice:
<br>1
<br>Enter your amount:
<br>750
<br>The money has been withdrawn.
<br>The balance has been updated.
<br>
<br>Press 1 to Withdraw
<br>Press 2 to Deposit
<br>Press 3 to get the Transaction History
<br>Press 4 to get Account Summary
<br>Press 5 to exit the program
<br>Enter your choice:
<br>1
<br>Enter your amount:
<br>10000
<br>Your Balance is Low
<br>
<br>Press 1 to Withdraw
<br>Press 2 to Deposit
<br>Press 3 to get the Transaction History
<br>Press 4 to get Account Summary
<br>Press 5 to exit the program
<br>Enter your choice:
<br>8
<br>Wrong choice Input
<br>
<br>Press 1 to Withdraw
<br>Press 2 to Deposit
<br>Press 3 to get the Transaction History
<br>Press 4 to get Account Summary
<br>Press 5 to exit the program
<br>Enter your choice:
<br>3
<br>Wd/Dp     Amount    Balance
<br>Withdraw  500       4500
<br>Deposit   200       4700
<br>Deposit   650       5350      
<br>Withdraw  200       5150
<br>Deposit   530       5680
<br>Deposit   420       6100
<br>Withdraw  750       5350
<br>
<br>Press 1 to Withdraw
<br>Press 2 to Deposit
<br>Press 3 to get the Transaction History
<br>Press 4 to get Account Summary
<br>Press 5 to exit the program
<br>Enter your choice:
<br>4
<br>Account Holder Name: Moaz Akhter
<br>Account No.: 22122028
<br>Your Balance: 5350
<br>Total No. of Transactions: 8
<br>Wd/Dp     Amount    Balance
<br>Withdraw  500       4500
<br>Deposit   200       4700
<br>Deposit   650       5350
<br>Withdraw  200       5150      
<br>Deposit   530       5680
<br>Deposit   420       6100
<br>Withdraw  750       5350
<br>
<br>Press 1 to Withdraw
<br>Press 2 to Deposit
<br>Press 3 to get the Transaction History
<br>Press 4 to get Account Summary
<br>Press 5 to exit the program
<br>Enter your choice:
<br>5
<br>

## Flowchart

![alt text](https://github.com/moazakhter99/22122028-MDS273L-JAVA/blob/master/Lab_FlowChart/Java_lab_4_flowchart.png)
