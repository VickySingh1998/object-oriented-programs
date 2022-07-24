package com.bridgelabz;

import java.util.*;
public class Account {
    static Scanner scanner = new Scanner(System.in);
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void debit(double balance) {
        System.out.print("Enter the amount to withdraw : ");
        double withdraw = scanner.nextDouble();
        if (withdraw > balance) {
            System.out.println("Debit amount exceeded account balance");
        } else
            balance = balance - withdraw;
        System.out.println("Remaining balance is : " + balance);

    }
    public static void main(String[] args) {
        System.out.print("Enter the account balance : ");
        Account account = new Account(scanner.nextDouble());
        account.debit(account.balance);
    }
}