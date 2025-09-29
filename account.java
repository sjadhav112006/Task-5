public class Account {
    // Private fields to encapsulate data
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // A static variable to generate unique account numbers
    private static int nextAccountNumber = 1001;

    // Constructor to initialize a new account
    public Account(String accountHolderName, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        // Assign a unique account number
        this.accountNumber = String.valueOf(nextAccountNumber++);
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Insufficient funds. Your balance is only $" + balance);
        }
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Override toString() to provide a string representation of the account details
    @Override
    public String toString() {
        return "Account Details:\n" +
               "  Account Number: " + accountNumber + "\n" +
               "  Holder Name: " + accountHolderName + "\n" +
               "  Balance: $" + String.format("%.2f", balance);
    }
}
