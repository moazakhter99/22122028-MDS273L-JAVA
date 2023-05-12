package Java_Lab.Lab_4;

import java.util.*;

public class Java_lab_4 {

    public static String accNo;
    public static String accName;
    public static int balance;
    public static Scanner scan = new Scanner(System.in);

    static void init() {
        System.out.print("Enter your Name: ");
        accName = scan.nextLine();
        System.out.print("Enter your account No.: ");
        accNo = scan.nextLine();
        System.out.print("Enter your previous balance: ");
        balance = scan.nextInt();
    }

    static boolean withdraw(int amt) {
        if (amt > balance) {
            System.out.println("Your Balance is Low");
            return false;
        } else {
            balance = balance - amt;
            System.out.println("The money has been withdrawn.");
            System.out.println("The balance has been updated.");
            return true;
        }

    }

    static void deposit(int amt) {
        balance = balance + amt;
        System.out.println("The money has been deposited in your account.");
        System.out.println("The balance has been updated.");
    }

    static void tranHistory(String[] tranType, int[] tranHistory, int[] bal, int con) {
        System.out.printf("%-10s" + "%-10s" + "%-10s" + "\n", "Wd/Dp", "Amount", "Balance");
        for (int i = 0; i < con; i++) {
            System.out.printf("%-10s" + "%-10d" + "%-10d" + "\n", tranType[i], tranHistory[i], bal[i]);
        }
    }

    static void summary(String[] Type, int[] History, int[] bal, int con) {
        System.out.println("Account Holder Name: " + accName);
        System.out.println("Account No.: " + accNo);
        System.out.println("Your Balance: " + balance);
        System.out.println("Total No. of Transactions: " + (con + 1));
        tranHistory(Type, History, bal, con);
    }

    public static void main(String[] args) {
        int[] transactionAmt = new int[100];
        String[] transactionType = new String[100];
        int[] tranBalance = new int[100];
        System.out.println("Enter your info to initialize your account");
        init();
        System.out.println("Your account has been initialized.");
        int choice;
        int count = 0;
        do {
            System.out.println("Press 1 to Withdraw");
            System.out.println("Press 2 to Deposit");
            System.out.println("Press 3 to get the Transaction History");
            System.out.println("Press 4 to get Account Summary");
            System.out.println("Press 5 to exit the program");
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your amount: ");
                    int withAmt = scan.nextInt();
                    Boolean bool = withdraw(withAmt);
                    System.out.println();
                    if (bool == true) {
                        transactionAmt[count] = withAmt;
                        transactionType[count] = "Withdraw";
                        tranBalance[count] = balance;
                        count += 1;
                    }
                    break;
                case 2:
                    System.out.println("Enter your amount: ");
                    int depAmt = scan.nextInt();
                    deposit(depAmt);
                    System.out.println();
                    transactionAmt[count] = depAmt;
                    transactionType[count] = "Deposit";
                    tranBalance[count] = balance;
                    count += 1;
                    break;
                case 3:
                    tranHistory(transactionType, transactionAmt, tranBalance, count);
                    System.out.println();
                    break;
                case 4:
                    summary(transactionType, transactionAmt, tranBalance, count);
                    System.out.println();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Wrong choice Input");
                    break;

            }
        } while (choice != 5);

    }

}
