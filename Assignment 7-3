/*Create an abstract BankAccount class with the following attributes:
● accountNumber (String)
● balance (double)
Implement abstract methods:
● deposit(double amount)
● withdraw(double amount)
Create concrete subclasses SavingsAccount and CurrentAccount that inherit from BankAccount
and implement the deposit() and withdraw() methods according to their specific interest rates
and transaction fees.*/
abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate); // Adding interest on deposit
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }
}
class CurrentAccount extends BankAccount {
    private double transactionFee;

    public CurrentAccount(String accountNumber, double balance, double transactionFee) {
        super(accountNumber, balance);
        this.transactionFee = transactionFee;
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        if (amount + transactionFee <= balance) {
            balance -= (amount + transactionFee); // Subtracting transaction fee on withdrawal
        } else {
            System.out.println("Insufficient funds in Current Account.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("S123", 1000, 0.05);
        BankAccount current = new CurrentAccount("C456", 2000, 10);
        savings.deposit(500);
        savings.withdraw(300);
        current.deposit(1000);
        current.withdraw(500);
        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Current Account Balance: " + current.getBalance());
    }
}
