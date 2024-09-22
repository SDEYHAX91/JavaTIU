/*Create a class ‘Account’with two overloaded constructors. The first constructor is used for
initializing the name of the account holder, the account number, the account type and the initial
amount in the account.The second constructor is used for initializing the name of the account
holder, the account number, the account type, addresses, type of account and current balance. The
account type, whether “Savings Account” or “Current Account” can be set based on the input 1 or
2 respectively. The Account class is havingthe member functionsdisplayName() to display the
details of the account, deposit() which is used to deposit the amount, withdraw() which is used to
remove the amount from the balance amount, and check_balance() which is used to display the
balance after deposit and withdraw amounts. Create objects of Account class and use them.*/

class Account {
    private String name;
    private String accountNumber;
    private String accountType;
    private String address;
    private double balance;

    public Account(String name, String accountNumber, int accountTypeChoice, double initialAmount) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
        setAccountType(accountTypeChoice);
    }
    public Account(String name, String accountNumber, int accountTypeChoice, String address, double currentBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.balance = currentBalance;
        setAccountType(accountTypeChoice);
    }
    private void setAccountType(int accountTypeChoice) {
        if (accountTypeChoice == 1) {
            this.accountType = "Savings Account";
        } else if (accountTypeChoice == 2) {
            this.accountType = "Current Account";
        } else {
            this.accountType = "Unknown Account Type";
        }
    }
    public void displayName() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        if (address != null) {
            System.out.println("Address: " + address);
        }
        System.out.println("Current Balance: $" + balance);
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    public void check_balance() {
        System.out.println("Current Balance: $" + balance);
    }
    public static void main(String[] args) {
        Account acc1 = new Account("John Doe", "123456789", 1, 500.00);
        acc1.displayName();
        acc1.deposit(200.00);
        acc1.withdraw(100.00);
        acc1.check_balance();
        Account acc2 = new Account("Jane Smith", "987654321", 2, "123 Main St, City", 1000.00);
        acc2.displayName();
        acc2.deposit(500.00);
        acc2.withdraw(1500.00);
        acc2.check_balance();
    }
}
