package com.labs.java.oops;

public class Account {
    int id; //
    String name;
    String type;
    double balance;
    boolean active;
    
    
    public Account() {
        System.out.println("default constructor called");
    }
    
    public Account(int id, String name, String type, double balance, boolean active) {
        System.out.println("parameter constructor called");
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.active = active;
    }
    
    void openAccount() {
        System.out.println("account opened");
    }
    
    void closedAccount() {
        System.out.println("account closed");
    }
    
    void deposit(double amount) {
        System.out.println("deposited "+amount);
        this.balance += amount;
    }
    
    void withdraw(double amount) {
        if(this.balance > amount) return;
        System.out.println("withdrawn "+amount);
        this.balance -= amount;
    }
    
    double checkBalance() {
        return balance;
    }
 
    public boolean equals(Object obj) {
        if(obj instanceof Account) {
            return this.id == ((Account)obj).id;
        }
        return false;
    }
    public String toString() {
        return("account id "+this.id);
        
    }
}
