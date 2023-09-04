package model.bankingApp;

public class BankAccount {
 private String accountNumber;
 private String accountHolder;
 private double balance;

 public BankAccount(String accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 public String getAccountNumber() {
     return accountNumber;
 }

 public String getAccountHolder() {
     return accountHolder;
 }

 public double getBalance() {
     return balance;
 }

 public void setBalance(double newBalance) {
     this.balance = newBalance;
 }

 @Override
 public String toString() {
     return "Account Number: " + accountNumber +
            "\nAccount Holder: " + accountHolder +
            "\nBalance: $" + balance;
 }
}

