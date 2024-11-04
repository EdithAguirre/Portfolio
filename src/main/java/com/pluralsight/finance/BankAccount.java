package com.pluralsight.finance;

import com.pluralsight.Valuable;

public class BankAccount implements Valuable {
    // Data fields
    private String name, accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Methods
    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    @Override
    public double getValue() {
        return this.balance;
    }
}
