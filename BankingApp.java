import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("🎉 Welcome to the Simple Banking App! 🎉");

        while (!exit) {
            System.out.println("\n-----------------------------------");
            System.out.println("Please choose an option:");
            System.out.println("1. Create a new Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter your full name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter initial deposit amount: $");
                    double initialDeposit = scanner.nextDouble();
                    Account newAccount = myBank.createAccount(name, initialDeposit);
                    System.out.println("Your new account number is: " + newAccount.getAccountNumber());
                    break;
                case 2:
                    System.out.print("Enter your account number: ");
                    String accNumDeposit = scanner.nextLine();
                    Account accDeposit = myBank.findAccount(accNumDeposit);
                    if (accDeposit != null) {
                        System.out.print("Enter amount to deposit: $");
                        double depositAmount = scanner.nextDouble();
                        accDeposit.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter your account number: ");
                    String accNumWithdraw = scanner.nextLine();
                    Account accWithdraw = myBank.findAccount(accNumWithdraw);
                    if (accWithdraw != null) {
                        System.out.print("Enter amount to withdraw: $");
                        double withdrawAmount = scanner.nextDouble();
                        accWithdraw.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter your account number: ");
                    String accNumDetails = scanner.nextLine();
                    Account accDetails = myBank.findAccount(accNumDetails);
                    if (accDetails != null) {
                        System.out.println(accDetails.toString());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for using the Simple Banking App. Goodbye! 👋");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
