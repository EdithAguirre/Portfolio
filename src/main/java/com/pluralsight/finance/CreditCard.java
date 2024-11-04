package com.pluralsight.finance;

import com.pluralsight.Valuable;

public class CreditCard implements Valuable {
    // Data fields
    private String name, accountNumber;
    private double balance;

    // Constructor
    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Methods
    public void charge(double amount){
    }

    public void pay(double amount){
        this.balance -= amount;
    }

    @Override
    public double getValue(){
        return 0;
    }
}
