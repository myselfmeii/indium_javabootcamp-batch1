package service.bankingApp;

import java.util.Map;
import java.util.TreeMap;

import model.bankingApp.BankAccount;

public class TreeMapimpl implements BankOperation {

    private Map<String, BankAccount> accounts = new TreeMap<>();

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
