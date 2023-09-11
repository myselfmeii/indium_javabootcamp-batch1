package service.bankingApp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import model.bankingApp.BankAccount;

public class Hashsetimpl implements BankOperation {

    private Set<BankAccount> accounts = new HashSet<>();

    @Override
    public void createAccount(String accountNumber, String accountHolder, double balance) {
        BankAccount newAccount = new BankAccount(accountNumber, accountHolder, balance);
        accounts.add(newAccount);
    }

    @Override
    public String readAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account.toString();
            }
        }
        return "Account not found";
    }

    @Override
    public void updateAccount(String accountNumber, double newBalance) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.setBalance(newBalance);
                return;
            }
        }
    }

    @Override
    public void deleteAccount(String accountNumber) {
        Iterator<BankAccount> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            BankAccount account = iterator.next();
            if (account.getAccountNumber().equals(accountNumber)) {
                iterator.remove();
                return;
            }
        }
    }
}
