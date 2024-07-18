package lab_4;

// Class to represent a Bank Account
class BankAccount {
    String AccountNumber; // account number
    double balance; // current balance

    // Constructor to initialize account number and balance
    BankAccount(String AccountNumber, double balance) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amt) {
        balance = balance + amt;
    }

    // Method to withdraw money from the account
    public void withdraw(double amt) {
        if (amt <= balance) {
            balance = balance - amt;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

// Class to represent a Savings Account (extends BankAccount)
class SavingsAcoount extends BankAccount {
    double withdrawalLimit; // maximum amount that can be withdrawn

    // Constructor to initialize account number, balance, and withdrawal limit
    SavingsAcoount(String AccountNumber, double balance, double withdrawalLimit) {
        super(AccountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Override the withdraw method to check for withdrawal limit
    public void withdraw(double amt) {
        if (amt <= withdrawalLimit) {
            super.withdraw(amt);
        } else {
            System.out.println("Withdrawal limit exceeded");
        }
    }
}

// Class to represent a Checking Account (extends BankAccount)
class CheckingAcoount extends BankAccount {
    double overdraftFee; // fee charged for overdrafts

    // Constructor to initialize account number, balance, and overdraft fee
    CheckingAcoount(String AccountNumber, double balance, double overdraftFee) {
        super(AccountNumber, balance);
        this.overdraftFee = overdraftFee;
    }

    // Override the withdraw method to check for overdrafts and apply fee
    public void withdraw(double amt) {
        if (amt <= getBalance()) {
            super.withdraw(amt);
        } else {
            System.out.println("Overdraft fee applied.");
            super.withdraw(amt + overdraftFee);
        }
    }
}

public class BankAccountMain {

    public static void main(String[] args) {
        // Create a Savings Account and perform a withdrawal
        SavingsAcoount sa = new SavingsAcoount("sa-8711", 5000, 1000);
        sa.withdraw(800);
        System.out.println("Account Number: " + sa.AccountNumber + ", Savings Account Balance: " + sa.getBalance());

        // Create a Checking Account and perform a withdrawal
        CheckingAcoount ca = new CheckingAcoount("ca-2211", 2000, 100);
        ca.withdraw(200);
        System.out.println("Account Number: " + ca.AccountNumber + ", Checking Account Balance: " + ca.getBalance());
    }
}

/*Dry Run
 
Account Number: sa-8711, Savings Account Balance: 4200.0
Account Number: ca-2211, Checking Account Balance: 1800.0


*/