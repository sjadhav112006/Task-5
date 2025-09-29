import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    // Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to create a new account and add it to the bank's list
    public Account createAccount(String holderName, double initialDeposit) {
        Account newAccount = new Account(holderName, initialDeposit);
        accounts.add(newAccount);
        System.out.println("Account created successfully for " + holderName);
        return newAccount;
    }

    // Method to find an account by its number
    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null; // Return null if account not found
    }
}
