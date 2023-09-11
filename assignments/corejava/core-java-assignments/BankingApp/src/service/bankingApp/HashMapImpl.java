package service.bankingApp;

import java.util.HashMap;

import model.bankingApp.BankAccount;

public class HashMapImpl implements BankOperation {

    private HashMap<String, BankAccount> accounts = new HashMap<>();

    @Override
    public void createAccount(String accountNumber, String accountHolder, double balance) {
        BankAccount newAccount = new BankAccount(accountNumber, accountHolder, balance);
        accounts.put(accountNumber, newAccount);
    }

    @Override
    public String readAccount(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            return account.toString();
        }
        return "Account not found";
    }

    @Override
    public void updateAccount(String accountNumber, double newBalance) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.setBalance(newBalance);
        }
    }

    @Override
    public void deleteAccount(String accountNumber) {
        accounts.remove(accountNumber);
    }
}
