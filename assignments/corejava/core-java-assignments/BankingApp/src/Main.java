
import java.util.Scanner;

import service.bankingApp.AccountServiceArrListImpl;
import service.bankingApp.BankOperation;
import service.bankingApp.BankOperationImpl;
import service.bankingApp.HashMapImpl;
import service.bankingApp.Hashset;
import service.bankingApp.Linkedlistimpl;
import service.bankingApp.TreeMapimpl;


public class Main {
    public static void main(String[] args) {
    	//BankOperationImpl bankOperation = new BankOperationImpl();
    	//AccountServiceArrListImpl bankOperation = new AccountServiceArrListImpl();
    	//Linkedlistimpl bankOperation = new Linkedlistimpl();
    	//HashMapImpl bankOperation = new HashMapImpl();
    	//TreeMapimpl bankOperation = new TreeMapimpl();
    	Hashset bankoperation = new Hashset();
    	
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bank Application Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Read Account");
            System.out.println("3. Update Account");
            System.out.println("4. Delete Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter Account Holder: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();
                    bankoperation.createAccount(accountNumber, accountHolder, balance);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    String accountInfo = bankoperation.readAccount(accountNumber);
                    System.out.println(accountInfo);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter New Balance: ");
                    double newBalance = scanner.nextDouble();
                    bankoperation.updateAccount(accountNumber, newBalance);
                    System.out.println("Account balance updated successfully!");
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextLine();
                    bankoperation.deleteAccount(accountNumber);
                    System.out.println("Account deleted successfully!");
                    break;

                case 5:
                    System.out.println("Exiting the Bank Application. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
