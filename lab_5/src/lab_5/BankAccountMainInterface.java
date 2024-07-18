//Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.

// package declaration
package lab_5;

//interface Account declaration
interface Account {

	// method to deposit amount
	void deposit(double amount);
	
	// method to withdraw amount
	void withdraw(double amount);
	
	// method to calculate interest
	double calculateInterest();
	
	// method to view balance
	double viewBalance();
	
}

//class SavingsAccount1 implements Account
class SavingsAccount1 implements Account {
	
	// fields for account number, balance, and interest rate
	String accountNumber;
	private double balance;
	private double interestRate;
	
	// constructor to initialize the account
	public SavingsAccount1(String accountNumber, double balance, double interestRate) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// overriding the deposit method
	@Override
	public void deposit(double amount) {
		
		balance = balance + amount;
		System.out.println("Deposit in Savings Account: " +amount);
		
	}

	// overriding the withdraw method
	@Override
	public void withdraw(double amount) {

		if (amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Withdrwal in Savings Account: " +amount);
		}
		
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}

	// overriding the calculateInterest method
	@Override
	public double calculateInterest() {
		
		return balance = balance + (balance * (interestRate / 100));
	}

	// method to view balance
	public double viewBalance() {
		
		return balance;
	} 
	
}

//class CurrentAccount1 implements Account
class CurrentAccount1 implements Account {
	
	// fields for account number, balance, and interest rate
	String accountNumber;
	private double balance;
	private double interestRate;

	// constructor to initialize the account
	public CurrentAccount1(String accountNumber, double balance, double interestRate) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	// overriding the deposit method
	@Override
	public void deposit(double amount) {
		
		balance = balance + amount;
		System.out.println("Deposit in Current Account: " +amount);
		
	}

	// overriding the withdraw method
	@Override
	public void withdraw(double amount) {
		
		if (amount <= balance)
		{
			balance = balance - amount;
			System.out.println("Withdrwal in Current Account: " +amount);
		}
		
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}

	// overriding the calculateInterest method
	@Override
	public double calculateInterest() {
		
		return balance = balance + (balance * (interestRate / 100));
	}

	// overriding the viewBalance method
	@Override
	public double viewBalance() {
		
		return balance;
	}
	
}


public class BankAccountMainInterface {

	public static void main(String[] args) {
		
		// creating a SavingsAccount1 object
		SavingsAccount1 sa = new SavingsAccount1("SA-8711", 20000, 3);
		
		// depositing 10000 into the SavingsAccount1
		sa.deposit(10000);
		
		// printing the account number and balance of the SavingsAccount1
		System.out.println("\nAccount Number is: " +sa.accountNumber );
		System.out.println("Total Savings Account Balance is: " +sa.viewBalance());
		
		System.out.println();
		
		// withdrawing 100 from the SavingsAccount1
		sa.withdraw(100);
		
		// printing the updated balance of the SavingsAccount1
		System.out.println("Total Savings Account Balance is: " +sa.viewBalance()+ "\n");
		
		// creating a CurrentAccount1 object
		CurrentAccount1 ca = new CurrentAccount1("CA-9856", 30000, 5);
		
		// depositing 5000 into the CurrentAccount1
		ca.deposit(5000);
		
		// printing the account number and balance of the CurrentAccount1
		System.out.println("\nAccount Number is: " +ca.accountNumber );
		System.out.println("Total Savings Account Balance is: " +ca.viewBalance());
		
		System.out.println();
		
		// withdrawing 500 from the CurrentAccount1
		ca.withdraw(500);
		
		// printing the updated balance of the CurrentAccount1
		System.out.println("Total Savings Account Balance is: " +ca.viewBalance());

	}

}

/*Dry Run

Deposit in Savings Account: 10000.0

Account Number is: SA-8711
Total Savings Account Balance is: 30000.0

Withdrwal in Savings Account: 100.0
Total Savings Account Balance is: 29900.0

Deposit in Current Account: 5000.0

Account Number is: CA-9856
Total Savings Account Balance is: 35000.0

Withdrwal in Current Account: 500.0
Total Savings Account Balance is: 34500.0

*/