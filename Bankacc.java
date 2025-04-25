import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor to assign initial values
    public BankAccount(String name, String accNumber, String accType, double initialBalance) {
        this.depositorName = name;
        this.accountNumber = accNumber;
        this.accountType = accType;
        this.balance = initialBalance;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw an amount after checking balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display the name and balance
    public void display() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter depositor name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();
        
        System.out.print("Enter account type: ");
        String accType = scanner.nextLine();
        
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        
        // Creating BankAccount object
        BankAccount account = new BankAccount(name, accNumber, accType, initialBalance);
        
        // Performing operations
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        
        // Display account details
        account.display();
        
        scanner.close();
    }
}
