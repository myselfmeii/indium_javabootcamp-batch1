package service.bankingApp;

public interface BankOperation {
 void createAccount(String accountNumber, String accountHolder, double balance);
 String readAccount(String accountNumber);
 void updateAccount(String accountNumber, double newBalance);
 void deleteAccount(String accountNumber);
}

