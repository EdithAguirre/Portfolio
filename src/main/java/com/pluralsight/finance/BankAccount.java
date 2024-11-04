package com.pluralsight.finance;

public class BankAccount implements Valuable{
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
    }

    public void withdraw(double amount){
    }

    @Override
    public double getValue() {
        return 0;
    }

}
