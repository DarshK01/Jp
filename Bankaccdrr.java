import java.util.Scanner;
class Account {
    protected String customerName;
    protected String accountNumber;
    protected String accountType;
    protected double balance;
    public Account(String name, String accNumber, String accType, double initialBalance) {
        this.customerName = name;
        this.accountNumber = accNumber;
        this.accountType = accType;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void displayBalance() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Balance: " + balance);
    }
}
class SavingAccount extends Account {
    private static final double INTEREST_RATE = 0.04;
    public SavingAccount(String name, String accNumber, double initialBalance) {
        super(name, accNumber, "Saving", initialBalance);
    }
    public void computeAndDepositInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest deposited: " + interest);
    }
}
class CurrentAccount extends Account {
    private static final double MIN_BALANCE = 1000;
    private static final double PENALTY = 50;
    public CurrentAccount(String name, String accNumber, double initialBalance) {
        super(name, accNumber, "Current", initialBalance);
    }
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance or minimum balance limit reached.");
        }
    }
    public void checkMinimumBalance() {
        if (balance < MIN_BALANCE) {
            balance -= PENALTY;
            System.out.println("Penalty imposed due to low balance. Penalty: " + PENALTY);
        }
    }
}
public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();
        System.out.print("Enter account type (Saving/Current): ");
        String accType = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        if (accType.equalsIgnoreCase("Saving")) {
            SavingAccount account = new SavingAccount(name, accNumber, initialBalance);
            account.computeAndDepositInterest();
            account.displayBalance();
        } else if (accType.equalsIgnoreCase("Current")) {
            CurrentAccount account = new CurrentAccount(name, accNumber, initialBalance);
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);
            account.checkMinimumBalance();
            account.displayBalance();
        } else {
            System.out.println("Invalid account type.");
        }
        scanner.close();
    }
}
