package com.pluralsight;

import com.pluralsight.finance.BankAccount;

public class FinanceApplication {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount( "Pam", "123",  12500);
        Valuable account2 = new BankAccount( "Gary", "456",1500);

        // try to deposit money into both accounts
        account1.deposit(100);  // Worked
        account2.deposit(100);      // Did not work


    }
}
