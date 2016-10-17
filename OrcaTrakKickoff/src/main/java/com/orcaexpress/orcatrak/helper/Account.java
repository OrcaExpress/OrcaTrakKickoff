package com.orcaexpress.orcatrak.helper;

import com.orcaexpress.orcatrak.entity.User;
//import com.orcaexpress.orcatrak.helper.Transaction;

public class Account {

    private User user;
    private int id;
    private String name;
    private double balance;
    private java.util.Date dateCreated;
    private java.util.ArrayList transactions = new java.util.ArrayList();

    public Account() {
        dateCreated = new java.util.Date();
    }

    public Account(String name, int id, double balance) {
        this();
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public java.util.ArrayList getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, ""));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, ""));
    }
}
