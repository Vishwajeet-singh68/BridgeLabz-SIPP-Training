package StaticThisFinalInstanceOf;

public class BankAccount {

    // 1. Static variable shared across all instances
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    // 2. Final variable - cannot be reassigned after initialization
    private final int accountNumber;

    // Instance variable
    private String accountHolderName;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // 1. Static method to return total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to display account details, uses instanceof
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Vishwajeet Singh", 10101);
        BankAccount acc2 = new BankAccount("Rahul Kumar", 10102);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();

        System.out.println("\nTotal Bank Accounts: " + BankAccount.getTotalAccounts());
    }
}

