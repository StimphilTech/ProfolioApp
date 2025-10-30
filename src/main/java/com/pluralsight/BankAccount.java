package com.pluralsight;

public class BankAccount implements Valuable {
    private int accountNumber;
    private String owner;
    private double balance;

    public BankAccount(int accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(owner + " withdrew $" + amount + ". Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for " + owner + ".");
        }
    }

    @Override
    public double getValue() {
        return balance;
    }

    public double getBalance() {
        return balance;
    }
    public String getOwner() {
        return owner;
}}
