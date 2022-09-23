import java.io.*;
public class BankingApplication {
    // Display present balance
    public static void displayBalance(int balance)
    {
        System.out.println("Present Balance : " + balance);
    }
    // Withdraw amount and update balance
    public static int amountWithdrawing(int balance, int withdrawAmount)
    {
        System.out.println("Do Withdrawn Operation:");
        System.out.println("Withdrawing Amount : " + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect money and card from ATM");
            displayBalance(balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
        return balance;
    }
    // Deposit amount and update balance
    public static int amountDepositing(int balance, int depositAmount)
    {
        System.out.println("Deposit Money Operation:");
        System.out.println("Depositing Amount : " + depositAmount);
        balance = balance + depositAmount;
        System.out.println("Money successfully deposited");
        displayBalance(balance);
        return balance;
    }

    public static void main(String args[])
    {
        int balance = 10000;
        int withdrawAmount = 5000;
        int depositAmount = 2000;
        displayBalance(balance);
        balance = amountWithdrawing(balance, withdrawAmount);
        balance = amountDepositing(balance, depositAmount);
    }
}

