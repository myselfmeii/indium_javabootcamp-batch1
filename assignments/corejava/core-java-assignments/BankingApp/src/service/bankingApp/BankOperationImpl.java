package service.bankingApp;


import java.util.ArrayList;
import java.util.List;

import model.bankingApp.BankAccount;

public class BankOperationImpl implements BankOperation {
 private List<BankAccount> accounts;

 public BankOperationImpl() {
     accounts = new ArrayList<>();
 }

 @Override
 public void createAccount(String accountNumber, String accountHolder, double balance) {
     BankAccount account = new BankAccount(accountNumber, accountHolder, balance);
     accounts.add(account);
 }

 @Override
 public String readAccount(String accountNumber) {
     for (BankAccount account : accounts) {
         if (account.getAccountNumber().equals(accountNumber)) {
             return account.toString();
         }
     }
     return "Account not found.";
 }

 @Override
 public void updateAccount(String accountNumber, double newBalance) {
     for (BankAccount account : accounts) {
         if (account.getAccountNumber().equals(accountNumber)) {
             account.setBalance(newBalance);
             break;
         }
     }
 }

 @Override
 public void deleteAccount(String accountNumber) {
     accounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));
 }
}
