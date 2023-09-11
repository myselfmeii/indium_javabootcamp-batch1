package service.bankingApp;

import java.util.LinkedList;
import java.util.Iterator;

import model.bankingApp.BankAccount;

public class Linkedlistimpl implements BankOperation {

    private LinkedList<BankAccount> accounts = new LinkedList<>();

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
